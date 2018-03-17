/**
 * 
 */
package com.dhirendra.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dhirendra.entity.Stock;
import com.dhirendra.exception.StockNotFoundException;
import com.dhirendra.service.StockService;

/**
 * @author dhirendra
 *
 */
@RestController
public class StockController {

	@Autowired
	StockService stockService;

	@GetMapping(value = "api/stocks")
	public List<Stock> getAllStocks() {
		return stockService.getAllStocks();
	}

	@GetMapping(value = "api/stocks/{id}")
	public Resource<Stock> getStock(@PathVariable final Long id) {
		Optional<Stock> stock = stockService.getStock(id);

		if (!stock.isPresent())
			throw new StockNotFoundException("id-" + id);

		Resource<Stock> resource = new Resource<Stock>(stock.get());

		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllStocks());

		resource.add(linkTo.withRel("stocks"));

		return resource;

	}

	@PutMapping(value = "api/stocks/{id}")
	public <T> ResponseEntity<T> updateStock(@Valid @PathVariable final Long id, @RequestBody final Stock stock) {
		Optional<Stock> stockOptional = stockService.getStock(id);

		if (!stockOptional.isPresent())
			return ResponseEntity.notFound().build();
		stock.setId(id);
		stockService.updateStock(id, stock);

		return ResponseEntity.noContent().build();
	}

	@PostMapping(value = "api/stocks")
	public <T> ResponseEntity<T> saveStock(@Valid @RequestBody final Stock stock) {
		Stock savedStock = stockService.saveStock(stock);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedStock.getId())
				.toUri();

		return ResponseEntity.created(location).build();

	}

}

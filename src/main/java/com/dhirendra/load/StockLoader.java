/**
 * 
 */
package com.dhirendra.load;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dhirendra.entity.Stock;
import com.dhirendra.repository.StockRepository;

@Component
public class StockLoader {
	private static final Logger logger = LoggerFactory.getLogger(StockLoader.class);

	@Autowired
	StockRepository stockRepository;

	@PostConstruct
	@Transactional
	public void loadAll() {
		stockRepository.saveAll(getData());

	}

	private List<Stock> getData() {
		List<Stock> listStock = new ArrayList<>();
		listStock.add(new Stock(1L, "Dhirendra", new BigDecimal(15000), new Timestamp(System.currentTimeMillis())));
		listStock.add(new Stock(2L, "Sahoo", new BigDecimal(25000), new Timestamp(System.currentTimeMillis())));
		listStock.add(new Stock(3L, "Kumar", new BigDecimal(35000), new Timestamp(System.currentTimeMillis())));
		logger.debug("--data loaded--");
		return listStock;
	}
}

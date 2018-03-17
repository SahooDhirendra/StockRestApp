package com.dhirendra.repository;

/**
 * @author dhirendra
 *
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhirendra.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{

}

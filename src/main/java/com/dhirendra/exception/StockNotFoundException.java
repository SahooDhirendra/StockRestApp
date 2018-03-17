/**
 * 
 */
package com.dhirendra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author dhirendra
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class StockNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3569705475801991787L;

	public StockNotFoundException(String exception) {

		super(exception);

	}

}

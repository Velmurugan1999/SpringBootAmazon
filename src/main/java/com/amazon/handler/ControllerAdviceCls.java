package com.amazon.handler;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.amazon.exceptions.AccessDeniedException;
import com.amazon.exceptions.OrderNotFoundException;
import com.amazon.exceptions.ProductNotFoundException;
import com.amazon.exceptions.UserNotFoundException;

@RestControllerAdvice
public class ControllerAdviceCls {
	@ExceptionHandler(UserNotFoundException.class)
	public String userNotFoundException(UserNotFoundException ex)
	{
		return ex.getMessage();
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public String productNotFoundException(ProductNotFoundException ex)
	{
		return ex.getMessage();
	}
	
	@ExceptionHandler(OrderNotFoundException.class)
	public String orderNotFoundException(OrderNotFoundException ex)
	{
		return ex.getMessage();
	}
	
	@ExceptionHandler(AccessDeniedException.class)
	public String accessDeniedException(AccessDeniedException ex)
	{
		return ex.getMessage();
	}
	
	
	@ExceptionHandler(EntityNotFoundException.class)
	public String entityNotFoundException(EntityNotFoundException ex)
	{
		return ex.getMessage();
	}
}

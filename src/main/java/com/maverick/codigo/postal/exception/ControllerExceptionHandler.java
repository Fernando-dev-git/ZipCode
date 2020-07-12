package com.maverick.codigo.postal.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Order(Ordered.LOWEST_PRECEDENCE)
public class ControllerExceptionHandler {

	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public @ResponseBody ErrorMessage handleNotFoundException(NotFoundException exception, HttpServletRequest request) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setStatus(HttpStatus.NOT_FOUND.value());
		errorMessage.setMessage(exception.getMessage());
		return errorMessage;
	}

}

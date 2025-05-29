package com.akash.SPRINGDATAJPA_EXAMPLE;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice //it is an annotation in Spring Framework (Java) used to handle exceptions, bind data, and apply cross-cutting concerns globally to all controllers in a Spring MVC application.
public class CustomExceptionHandler extends ResponseEntityExceptionHandler { //ResponseEntityExceptionHandler -> It’s a Spring class that provides default implementations for handling many common Spring MVC exceptions
	
	@ExceptionHandler(value = {Exception.class}) //@ExceptionHandler is a Spring MVC annotation used to define custom exception-handling methods inside a controller (or a @ControllerAdvice class). When an exception is thrown during the execution of a controller method, Spring looks for a method annotated with @ExceptionHandler to handle that exception.
	public ResponseEntity<Object> handleError(Exception e, WebRequest req) {
		String msg = "Internal Server Error";
		return handleExceptionInternal(e, msg, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, req); //handleExceptionInternal is a protected method in Spring’s ResponseEntityExceptionHandler class. It provides a centralized way to build a ResponseEntity for exception responses.
	}
}

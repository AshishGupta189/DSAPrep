package com.masai.demo.model;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
		@ExceptionHandler(BookNotFoundException.class)
		public ResponseEntity<String> myIllegalHandler(BookNotFoundException ie) {
			return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
		}
		//to handle any other type of Exception
		@ExceptionHandler(Exception.class)
		public ResponseEntity<String> myExceptionHandler(Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}

	
}

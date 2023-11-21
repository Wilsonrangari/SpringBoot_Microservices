package in.ashokit.execption;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//how to represetnt global exception handler

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e){
		
		String exMsg=e.getMessage();
		
		ErrorInfo info=new ErrorInfo();
		info.setCode("SBIEX0003");
		info.setMsg(exMsg);
		info.setWhen(LocalDateTime.now());
		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

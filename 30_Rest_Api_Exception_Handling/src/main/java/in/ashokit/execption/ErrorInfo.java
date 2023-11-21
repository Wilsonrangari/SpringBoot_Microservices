package in.ashokit.execption;


import java.time.LocalDateTime;

import lombok.Data;


//when exception occur i need to send this data 
@Data
public class ErrorInfo {
	
	private String code;
	private String msg;
	private LocalDateTime when;

}

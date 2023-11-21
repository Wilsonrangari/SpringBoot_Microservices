package in.ashokit.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	@Scheduled(fixedRate = 3000)
	public void generateReport() {
		
		//logic
		
		System.out.println("report genarated");
	}
	  
}

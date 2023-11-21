package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//target class
@Service
public class ReportService {
	
	@Autowired
	//@Qualifier("mysqldb")
	private ReportDao dao;
	
	//bussiness logic
	public void generateReport() {
		
		dao.getData();
		System.out.println("Report Generated....");
	}
	
	

}

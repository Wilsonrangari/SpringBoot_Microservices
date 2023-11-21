package in.ashokit.beans;

import org.springframework.stereotype.Repository;

//@Repository
@Repository("mysqldb")
public class MySqlDBReportDB implements ReportDao{

	public void getData() {
		
		System.out.println("getting data from MySql db......");
		
	}

}

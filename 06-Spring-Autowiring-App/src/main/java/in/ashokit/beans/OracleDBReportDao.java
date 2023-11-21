   package in.ashokit.beans;

import org.springframework.stereotype.Repository;

//@Repository("dao")   -->here bean name is matching with variable name--> Here OracleDBREportDao is having vairiable name dao so it will call this method only so depend object injected into target object
//@Repository("oracledb") //--> here bean name is not matching with variable anme dao

public class OracleDBReportDao implements ReportDao{

	public void getData() {
		
		System.out.println("getting data from oracle db......");
		
		
	}

}

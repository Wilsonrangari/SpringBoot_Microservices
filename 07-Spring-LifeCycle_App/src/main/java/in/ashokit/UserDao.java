package in.ashokit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//public class UserDao {

public class UserDao implements InitializingBean,DisposableBean{
	
	public UserDao() {
		System.out.println("Userdao:: Constructor");
	}
	
	/*
	 * public void init() {
	 * 
	 * System.out.println("getting db connection"); }
	 */
	public void getData() {
		System.out.println("getting data from db...");
	}
	
	/*
	 * public void destroy() { System.out.println("closing db connection"); }
	 */

	public void afterPropertiesSet() throws Exception {
		System.out.println("INIT method");
		
	}
	
	public void destroy() throws Exception {
		System.out.println("Destroy method");
		
	}

}

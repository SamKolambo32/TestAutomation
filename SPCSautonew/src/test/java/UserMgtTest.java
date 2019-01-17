import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class UserMgtTest extends Base1Test {
	
	@Test(priority = 1)
	public void UserCreate() throws FileNotFoundException, IOException, Exception {
		
 
		LoginP login = new LoginP(driver);
		NewApplicantPage NwAp = new NewApplicantPage(driver);
		UserMgtPage UserPage = new UserMgtPage(driver);

		
		//driver.get("http://192.168.1.29:9085/SPCS_QA_V1.28/login.htm");
		
		//login to app
		login.enterValidUserName();
		UserPage.SelectUserNewApplicants();
		
	
	
	
	
	
	
	
	}
	
	
	

}

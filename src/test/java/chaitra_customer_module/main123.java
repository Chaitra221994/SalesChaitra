package chaitra_customer_module;

import org.testng.annotations.Test;

public class main123 {
	@Test(groups="smokesuite")
	public void samplescript_3()
	{
		System.out.println("-----Smoke 3-----");
		System.out.println("-----Smoke 4-----");
		System.out.println("-----Smoke 5-----");
		
	}
	
	@Test(groups={"smokesuite","regressionsuite"})
	public void samplescript_4()
	{
		System.out.println("-----Smoke and Regression 4-----");
	}
}

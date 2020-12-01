package testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Parameters({"URL"})
	@Test
	public void random3(String URL) {
		System.out.println("WebSite");
		System.out.println(URL);
	}
	@Test
	public void random4(String URL){
		System.out.println("UI automation");
		System.out.println(URL);
	}
	@Test(timeOut=4000)
	public void random5() {
		System.out.println("UI auto");
	}
}

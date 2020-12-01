package testing;

import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void random5() {
		System.out.println("Performance");
	}
	@Test(groups= {"Smoke"})
	public void random6() {
		System.out.println("Security");
	}
}

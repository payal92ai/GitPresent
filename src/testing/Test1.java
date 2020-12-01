package testing;

import org.testng.annotations.Test;

public class Test1 {
	@Test()
	public void random() {
		int a =0;
		int b=1;
		int c;
		System.out.print(a+" "+b);
		for(int i=0;i<=10;i++) {
			c= a + b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	
	@Test
	public void random2() {
		System.out.println("Mobile");
	}

}

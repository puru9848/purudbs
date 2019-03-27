package com.dbs.traninig.purudbs;

public class Test {
  
  
	@Test
	public void test() {
		App app = new App();
		String msg = app.greet();
		assertEquals("Hello", msg);
	}


}

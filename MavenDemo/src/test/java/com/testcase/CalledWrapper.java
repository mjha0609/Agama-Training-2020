package com.testcase;

import java.io.IOException;

public class CalledWrapper 

public static void main(String[] args) throws IOException  {
	WrapperMethod wm = new WrapperMethod();
	wm.insertapp("https://www.facebook.com");
	wm.enterbyid("email", "joshij@gmail.com");
	wm.enterbyid("pass", "xxxxxx");
	wm.clickbyxpath("u_0_2");
	wm.takesnap("E:\\takescreen\\file1.png");
	wm.closeapp();
}
}



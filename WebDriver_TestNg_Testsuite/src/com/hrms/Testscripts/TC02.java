package com.hrms.Testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC02 {
	@Test
	 public void tc01 ()throws Exception {
		General obj = new General ();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.Closebrowser();
	}
	}
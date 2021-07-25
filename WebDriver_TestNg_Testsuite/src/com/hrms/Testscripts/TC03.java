package com.hrms.Testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC03 {
@Test
public void tc03() throws Exception{;
	General obj = new General ();
	obj.openApplication();
	obj.login();
	obj.AddEmployee();
	obj.logout();
}
}
 
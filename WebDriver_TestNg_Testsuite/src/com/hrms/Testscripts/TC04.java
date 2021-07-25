package com.hrms.Testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC04 {
@Test
public void tc04 ()throws Exception {
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.DeleteEmployee();;
	obj.logout();
	obj.Closebrowser();
}
}
 
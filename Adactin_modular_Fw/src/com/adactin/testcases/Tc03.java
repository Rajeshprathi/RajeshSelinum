package com.adactin.testcases;

import com.adactin.lib.General;

public class Tc03 {
	public static void main(String args[]) throws Exception {
		General obj =new General();
		obj.openApplication();
		obj.login();
		obj.searchhotel ();
		obj.selecthotel();
		obj.logout();
	}
}


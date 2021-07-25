package com.adactin.testcases;
import com.adactin.lib.General;
public class Tc02 {
	public static void main(String args[]) throws Exception {
		General obj =new General();
		obj.openApplication();
		obj.login();
		obj.searchhotel ();
		obj.logout();
	}
}
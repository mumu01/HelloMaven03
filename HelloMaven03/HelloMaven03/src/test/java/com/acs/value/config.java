
package com.acs.value;

public class config {
	String ACSPath;
	String PayPath;
	String Browse;
	
	
	public String getACSPath() {
		return "http://192.168.100.180:8080/acs-admin";
		//return "http://192.168.100.211:8080/acs-admin";
	}
	public void setACSPath(String aCSPath) {
		ACSPath = aCSPath;
	}
	public String getPayPath() {
		return "http://192.168.100.180:8080/mpisimulator";
	}
	public void setPayPath(String payPath) {
		PayPath = payPath;
	}
	public String getBrowse() {
		// firefox, chrome, ie
		return "firefox";
	}
	public void setBrowse(String browse) {
		Browse = browse;
	}
	
}

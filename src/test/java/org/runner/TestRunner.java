package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\resources\\Feature"},
		glue = {"org.step","org.hooks"},
		dryRun=false,		
		monochrome=true,		
		plugin= {"pretty",
				"rerun:rerun\\rerun.txt",
				"html:C:\\Users\\welcome\\eclipse-workspace\\EyeBuyDirectCucumber\\AllReports\\HTML Report",
				"json:C:\\Users\\welcome\\eclipse-workspace\\EyeBuyDirectCucumber\\AllReports\\JSON Report\\eyebuydirect.json",
				"junit:C:\\Users\\welcome\\eclipse-workspace\\EyeBuyDirectCucumber\\AllReports\\JUNIT Report\\eyebuydirect.xml"				
				}
		)
public class TestRunner {
	
	@AfterClass
	public static void tc1() {
		JVMReport.getJvmReport("C:\\Users\\welcome\\eclipse-workspace\\EyeBuyDirectCucumber\\AllReports\\JVM Report", "C:\\Users\\welcome\\eclipse-workspace\\EyeBuyDirectCucumber\\AllReports\\JSON Report\\eyebuydirect.json");
	}

}

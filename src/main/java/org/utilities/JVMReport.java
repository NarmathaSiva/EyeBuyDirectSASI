package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JVMReport {
	
	public static void getJvmReport(String jvmpath, String JsonPath) {
		//target location
		File f = new File(jvmpath);
		
		Configuration c = new Configuration(f,"EyeBuyDirect");
		c.addClassifications("Application", "EyeBuyDirect");
		c.addClassifications("Platform", "Chrome Browser");
		c.addClassifications("Operating Sytem", "Windows 10");
		c.addClassifications("Java Version", "JDK 1.8");
		
		List<String> l = new ArrayList();
		l.add(JsonPath);
		
		ReportBuilder r = new ReportBuilder(l,c);
		Reportable rl = r.generateReports();
		
	}

}

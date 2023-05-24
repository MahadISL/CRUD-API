package com.evampsaanga.employeemanagement3;

import com.evampsaanga.employeemanagement3.EmployeeManagement3Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EmployeeManagement3Application.class);
	}

}

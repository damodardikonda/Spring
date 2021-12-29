package com.employeeDetails.proj.EmployeeDetails;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@EntityScan(basePackages = "com.employeeDetails.proj.EmployeeDetails") 
class EmployeeDetailsApplicationTests {

	@Test
	void contextLoads() {
	}

}

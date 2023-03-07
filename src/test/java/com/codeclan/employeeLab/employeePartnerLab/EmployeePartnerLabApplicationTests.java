package com.codeclan.employeeLab.employeePartnerLab;

import com.codeclan.employeeLab.employeePartnerLab.models.Assignment;
import com.codeclan.employeeLab.employeePartnerLab.models.Employee;
import com.codeclan.employeeLab.employeePartnerLab.repositories.AssignmentRepository;
import com.codeclan.employeeLab.employeePartnerLab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeePartnerLabApplicationTests {

	//Dependency Injection:
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	AssignmentRepository assignmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createSingleEmployeeAndSave() {
		employeeRepository.deleteAll();

		Assignment assignment = new Assignment();
		assignmentRepository.save(assignment);

		Employee employee = new Employee("Jamima", "Smith", 123, assignment);
		employeeRepository.save(employee);
	}

}

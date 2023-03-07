package com.codeclan.employeeLab.employeePartnerLab.repositories;

import com.codeclan.employeeLab.employeePartnerLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

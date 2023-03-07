package com.codeclan.employeeLab.employeePartnerLab.repositories;

import com.codeclan.employeeLab.employeePartnerLab.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}

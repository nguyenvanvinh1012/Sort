package com.nguyenvanvinh.lab23a.repository;

import com.nguyenvanvinh.lab23a.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}


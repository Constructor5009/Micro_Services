package com.nmims.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nmims.core.entity.Employee;

@Repository
public interface MyEmployeeRepos extends JpaRepository<Employee, Long> {

	

}

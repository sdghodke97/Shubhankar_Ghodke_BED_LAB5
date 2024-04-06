package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeRepository;
import com.employee.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	// find All
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	// find by id
	public Employee findById(int id) {
		Optional<Employee> result = employeeRepository.findById(id);
		Employee employee = null;
		if (result.isPresent()) {
			employee = result.get();
		} else {
			throw new RuntimeException("Did not find the employee ");
		}
		return employee;

	}

	// Insert
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	// update
//	public List<Employee> update() {
//
//	}

	// delete
	public void deleteById(int Id) {
		employeeRepository.deleteById(Id);
	}
}

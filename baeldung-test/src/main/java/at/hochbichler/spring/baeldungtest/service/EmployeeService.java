package at.hochbichler.spring.baeldungtest.service;

import at.hochbichler.spring.baeldungtest.data.Employee;
import at.hochbichler.spring.baeldungtest.data.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}

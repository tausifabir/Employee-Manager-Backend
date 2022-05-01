package com.employee.employee.manager.Controller;

import com.employee.employee.manager.Entity.Employee;
import com.employee.employee.manager.Service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    private ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee>employeeList = employeeService.findAllEmployees();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @PostMapping("/add")
    private ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    private ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee updatedEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

/*    @GetMapping("/find/{id}")
    private ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) throws Throwable {
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/update/{id}")
    private ResponseEntity<?> deleteEmployee(@PathVariable ("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }*/
}

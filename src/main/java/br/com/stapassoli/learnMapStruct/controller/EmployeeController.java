package br.com.stapassoli.learnMapStruct.controller;

import br.com.stapassoli.learnMapStruct.dto.EmployeeDTO;
import br.com.stapassoli.learnMapStruct.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeBy(@PathVariable int id) {
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }

}

package br.com.stapassoli.learnMapStruct.service;

import br.com.stapassoli.learnMapStruct.dto.EmployeeDTO;
import br.com.stapassoli.learnMapStruct.entity.Employee;
import br.com.stapassoli.learnMapStruct.mapper.EmployeeMapper;
import br.com.stapassoli.learnMapStruct.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeDTO getEmployee(int id) {
        Employee employee = employeeRepository.getEmployeeBy(id);
        return employeeMapper.employeeToEmployeeDTO(employee);
    }

}

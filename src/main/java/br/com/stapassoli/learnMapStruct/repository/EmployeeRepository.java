package br.com.stapassoli.learnMapStruct.repository;

import br.com.stapassoli.learnMapStruct.entity.Division;
import br.com.stapassoli.learnMapStruct.entity.Employee;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EmployeeRepository {

    Division dev = Division.builder().id(1).name("DEV").build();
    Division po = Division.builder().id(1).name("PO").build();
    Division tech_lead = Division.builder().id(1).name("TECH_LEAD").build();

    List<Employee> employees = List.of(
            Employee.builder().id(1).name("John").division(dev).build(),
            Employee.builder().id(2).name("Paul").division(po).build(),
            Employee.builder().id(3).name("George").division(tech_lead).build()
    );

    public Employee getEmployeeBy(int id) {
        return employees
                .stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Entity not found"));
    }

}

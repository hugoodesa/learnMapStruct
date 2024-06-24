package br.com.stapassoli.learnMapStruct.mapper;

import br.com.stapassoli.learnMapStruct.dto.EmployeeDTO;
import br.com.stapassoli.learnMapStruct.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(target = "employeeId", source = "id")
    @Mapping(target = "employeeName", source = "name")
    EmployeeDTO employeeToEmployeeDTO(Employee entity);

    @Mapping(target = "id", source = "employeeId")
    @Mapping(target = "name", source = "employeeName")
    Employee employeeDTOtoEmployee(EmployeeDTO dto);

}

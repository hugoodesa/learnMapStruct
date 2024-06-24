package br.com.stapassoli.learnMapStruct.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private int employeeId;
    private String employeeName;
    private DivisionDTO division;

}

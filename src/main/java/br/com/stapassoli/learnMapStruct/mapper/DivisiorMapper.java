package br.com.stapassoli.learnMapStruct.mapper;

import br.com.stapassoli.learnMapStruct.dto.DivisionDTO;
import br.com.stapassoli.learnMapStruct.entity.Division;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DivisiorMapper {

    DivisionDTO divisionToDivisionDTO(Division entity);

    Division divisionDTOtoDivision(DivisionDTO dto);

}

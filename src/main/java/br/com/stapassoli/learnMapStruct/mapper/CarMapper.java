package br.com.stapassoli.learnMapStruct.mapper;

import br.com.stapassoli.learnMapStruct.dto.CarDTO;
import br.com.stapassoli.learnMapStruct.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDTO carToCarDto(Car car);

}

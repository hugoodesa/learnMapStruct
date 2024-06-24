package br.com.stapassoli.learnMapStruct.service;

import br.com.stapassoli.learnMapStruct.dto.CarDTO;
import br.com.stapassoli.learnMapStruct.entity.Car;
import br.com.stapassoli.learnMapStruct.mapper.CarMapper;
import br.com.stapassoli.learnMapStruct.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarDTO getCar(Long id) {
        Car car = carRepository.getCarById(id);

        car.getNumberOfSeats();

        return carMapper.carToCarDto(car);
    }

}

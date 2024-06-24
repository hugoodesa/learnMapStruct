package br.com.stapassoli.learnMapStruct.repository;

import br.com.stapassoli.learnMapStruct.entity.Car;
import br.com.stapassoli.learnMapStruct.enums.CarType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarRepository {

    List<Car> cars = List.of(
            Car.builder().id(1L).make("Corsa").numberOfSeats(4).type(CarType.HATCH).build(),
            Car.builder().id(2L).make("Fiorino").numberOfSeats(2).type(CarType.HATCH).build(),
            Car.builder().id(3L).make("Monza").numberOfSeats(5).type(CarType.HATCH).build(),
            Car.builder().id(4L).make("Palio").numberOfSeats(5).type(CarType.HATCH).build(),
            Car.builder().id(5L).make("Fusca").numberOfSeats(3).type(CarType.HATCH).build()
    );

    public Car getCarById(Long id) {
        return cars
                .stream()
                .filter(car -> car.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Entity not found"));
    }

}

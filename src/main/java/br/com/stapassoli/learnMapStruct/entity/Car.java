package br.com.stapassoli.learnMapStruct.entity;

import br.com.stapassoli.learnMapStruct.enums.CarType;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private Long id;
    private String make;
    private int numberOfSeats;
    private CarType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}

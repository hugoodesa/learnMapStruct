package br.com.stapassoli.learnMapStruct.entity;

import br.com.stapassoli.learnMapStruct.enums.CarType;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private Long id;
    private String make;
    private int numberOfSeats;
    private CarType type;

}

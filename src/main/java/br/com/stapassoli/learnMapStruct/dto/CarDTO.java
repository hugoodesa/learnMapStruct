package br.com.stapassoli.learnMapStruct.dto;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    private String make;
    private int seatCount;
    private String type;

}

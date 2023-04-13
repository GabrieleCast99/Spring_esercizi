package spring.esercizi.First.API5.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
public class CarDTO {
    @NotNull
    private String id;

    @NotNull
    private String modelName;

    private double price;
}

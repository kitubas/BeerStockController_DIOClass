package one.digitalinnovation.beerstock.dto;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MaxDTO {

    @NotNull
    @Max(500)
    private Integer newMax;
}

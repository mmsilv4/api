package my_pet.api.animal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataAnimal(
        @NotBlank
        String name,
        @NotNull
        AnimalType animal_type,
        @NotBlank
        String breed,
        @NotBlank
        String color,
        @NotNull
        Gender gender,
        @NotBlank
        String age) {

}

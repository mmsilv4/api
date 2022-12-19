package my_pet.api.animal;

import jakarta.validation.constraints.NotNull;

public record DataUpdateAnimal(
    @NotNull
    Integer animal_code,
    String name) {
}

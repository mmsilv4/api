package my_pet.api.human;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import my_pet.api.address.DataAddress;

public record DataHuman(
        @NotBlank
        String name,
        @NotBlank
        String cpf,
        Long animal_cod,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String phone,
        @NotNull @Valid
        DataAddress address) {

}

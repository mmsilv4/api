package my_pet.api.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DataAddress(
        @NotBlank
        String street,
        @NotBlank
        String number,
        @NotBlank
        String district,
        @NotBlank
        String city,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String postCode,
        @NotBlank
        String country) {
}

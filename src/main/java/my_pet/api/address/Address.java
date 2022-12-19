package my_pet.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String number;
    private String district;
    private String city;
    private String postCode;
    private String country;

    public Address(DataAddress data) {
        this.street = data.street();
        this.number = data.number();
        this.district = data.district();
        this.city = data.city();
        this.postCode = data.postCode();
        this.country = data.country();

    }
}

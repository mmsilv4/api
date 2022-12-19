package my_pet.api.human;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import my_pet.api.address.Address;
import my_pet.api.animal.Animal;

@Table(name = "human")
@Entity(name = "Human")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "animal_cod")
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    @ManyToOne(optional = true)
    @JoinColumn(name = "animal_cod", referencedColumnName = "animal_cod", nullable = true) private Animal animal_cod;
    private String name;
    private String cpf;
    private String email;
    private String phone;
    @Embedded
    private Address address;

    public Human(DataHuman data) {
        this.cpf = data.cpf();
        this.name = data.name();
        this.email = data.email();;
        this.phone = data.phone();
        this.address = new Address(data.address());
    }
}

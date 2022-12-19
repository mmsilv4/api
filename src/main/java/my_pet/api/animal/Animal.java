package my_pet.api.animal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "animals")
@Entity(name = "Animal")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "animal_cod")
public class Animal {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer animal_cod;
    private String name;


    @Enumerated(EnumType.STRING)
    private AnimalType animal_type;

    private String breed;
    private String color;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String age;

    private Boolean avaliable;

    public Animal(DataAnimal data) {
        this.avaliable = true; // by default the animals are registered as available
        this.name = data.name();
        this.animal_type = data.animal_type();
        this.breed = data.breed();
        this.color = data.color();
        this.gender = data.gender();
        this.age = data.age();
    }

    public void updateData(DataUpdateAnimal data) {
        if (data.name() != null){
            this.name = data.name();
        }
    }
}

package my_pet.api.animal;

public record DataListAnimals(Integer animal_code, String nome, AnimalType animal_type, String breed,Gender gender) {

    public DataListAnimals(Animal animal){
        this(animal.getAnimal_cod() ,animal.getName(), animal.getAnimal_type(), animal.getBreed(), animal.getGender());
    }

}

package my_pet.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import my_pet.api.animal.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    @PostMapping
    @Transactional
    public void createAnimal(@RequestBody @Valid DataAnimal data) {
        repository.save(new Animal(data));
    }

    @GetMapping
    public Page<DataListAnimals> getAnimals(@PageableDefault(size = 10, sort = {"name"}) Pageable pagination){
        return repository.findAll(pagination).map(DataListAnimals::new);
    }

    @PutMapping
    @Transactional
    public void updateAnimal(@RequestBody @Valid DataUpdateAnimal data){
        var animal = repository.getReferenceById(data.animal_code());
        animal.updateData(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteAnimal(@PathVariable Integer id){
        repository.deleteById(id);
    }
}

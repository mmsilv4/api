package my_pet.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import my_pet.api.human.DataHuman;
import my_pet.api.human.Human;
import my_pet.api.human.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/humans")
public class HumanController {

    @Autowired
    private HumanRepository repository;

    @PostMapping
    @Transactional
    public void createHuman(@RequestBody @Valid DataHuman data){
        repository.save(new Human(data));
    }
}

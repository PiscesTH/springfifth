package com.green.springfifth.person;

import com.green.springfifth.person.model.InsertDto;
import com.green.springfifth.person.model.SelectAllVo;
import com.green.springfifth.person.model.SelectVo;
import com.green.springfifth.person.model.UpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService service;

    @PostMapping("/person")
    public ResVo insPerson(@RequestBody InsertDto dto) {
        int result = service.insPerson(dto);
        return new ResVo(result);
    }

    @GetMapping("/person")
    public List<SelectAllVo> selPersonAll() {
        return service.selPersonAll();
    }

    @GetMapping("/person/{person_id}")
    public SelectVo selOnePerson(@PathVariable(value = "person_id") int personId) {
        return service.selOnePerson(personId);
    }

    @PutMapping("/person")
    public ResVo updPerson(@RequestBody UpdateDto dto){
        int result = service.updPerson(dto);
        System.out.println(result);
        return new ResVo(result);
    }

    @DeleteMapping("/person/{person_id}")
    public ResVo delPerson(@PathVariable (value = "person_id") int personId){
        int result = service.delPerson(personId);
        return new ResVo(result);
    }
}

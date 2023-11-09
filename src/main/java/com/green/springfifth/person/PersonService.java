package com.green.springfifth.person;

import com.green.springfifth.person.model.InsertDto;
import com.green.springfifth.person.model.SelectAllVo;
import com.green.springfifth.person.model.SelectVo;
import com.green.springfifth.person.model.UpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonMapper mapper;

    public int insPerson(InsertDto dto){
        return mapper.insPerson(dto);
    }
    public List<SelectAllVo> selPersonAll(){
        return mapper.selPersonAll();
    }
    public SelectVo selOnePerson(int personId){
        return mapper.selOnePerson(personId);
    }
    public int updPerson(UpdateDto dto){
        return mapper.updPerson(dto);
    }
    public int delPerson(int personId){
        return mapper.delPerson(personId);
    }
}

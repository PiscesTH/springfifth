package com.green.springfifth.person;

import com.green.springfifth.person.model.InsertDto;
import com.green.springfifth.person.model.SelectAllVo;
import com.green.springfifth.person.model.SelectVo;
import com.green.springfifth.person.model.UpdateDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {
    int insPerson(InsertDto dto);
    List<SelectAllVo> selPersonAll();
    SelectVo selOnePerson(int personId);
    int updPerson(UpdateDto dto);
    int delPerson(int personId);
}

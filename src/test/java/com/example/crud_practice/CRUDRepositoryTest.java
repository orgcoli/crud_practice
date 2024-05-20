package com.example.crud_practice;

import com.example.crud_practice.DTO.CRUDDTO;
import com.example.crud_practice.Entity.CRUDEntitty;
import com.example.crud_practice.Repository.CRUDRepository;
import com.example.crud_practice.Service.CRUDService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CRUDRepositoryTest {
    @Autowired
    CRUDRepository crudRepository;

    @Test
    public void insert() throws Exception{
        CRUDEntitty crudEntity = CRUDEntitty.builder() //builder 사용
                .title("test")      //제목에 test
                .content("content") //내용에 content
                .build();
        crudRepository.save(crudEntity);
    }
}

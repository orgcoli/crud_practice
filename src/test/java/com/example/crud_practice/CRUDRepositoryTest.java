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
        CRUDEntitty crudEntitty = CRUDEntitty.builder()
                .title("test")
                .content("content")
                .build();
        crudRepository.save(crudEntitty);
    }
}

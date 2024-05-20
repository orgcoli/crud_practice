package com.example.crud_practice;

import com.example.crud_practice.DTO.CRUDDTO;
import com.example.crud_practice.Service.CRUDService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CRUDServiceTest {
    @Autowired
    CRUDService crudService;

    @Test
    public void insert() throws Exception{
        CRUDDTO cruddto = CRUDDTO.builder()
                .title("test2")
                .content("content2")
                .build();
        crudService.create(cruddto);
    }
}

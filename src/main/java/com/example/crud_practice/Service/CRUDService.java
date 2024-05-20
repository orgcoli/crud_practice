package com.example.crud_practice.Service;

import com.example.crud_practice.DTO.CRUDDTO;
import com.example.crud_practice.Entity.CRUDEntitty;
import com.example.crud_practice.Repository.CRUDRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CRUDService {
    private final CRUDRepository crudRepository;
    private ModelMapper modelMapper = new ModelMapper();

    //게시글 작성
    public void create(CRUDDTO cruddto)throws Exception{
        CRUDEntitty crudEntitty = modelMapper.map(cruddto, CRUDEntitty.class);

        crudRepository.save(crudEntitty);
    }

    //게시글 하나 조회
    public CRUDDTO readOne(Long id)throws Exception{
        Optional<CRUDEntitty> data = crudRepository.findById(id);

        CRUDDTO cruddto = modelMapper.map(data, CRUDDTO.class);
        return cruddto;
    }

    //게시글 전체 조회
    public List<CRUDDTO> readAll() throws Exception{
        List<CRUDEntitty> list = crudRepository.findAll();

        List<CRUDDTO> result = Arrays.asList(modelMapper.map(list, CRUDDTO[].class));
        return result;
    }

    //게시글 수정
    public void update(CRUDDTO cruddto)throws Exception{
        Long id = cruddto.getId();
        Optional<CRUDEntitty> data = crudRepository.findById(id);

        CRUDEntitty test = data.orElseThrow();
        CRUDEntitty update = modelMapper.map(cruddto, CRUDEntitty.class);
        update.setId(test.getId());

        crudRepository.save(update);
    }

    //게시글 삭제
    public void delete(Long id)throws Exception{
        crudRepository.deleteById(id);
    }
}

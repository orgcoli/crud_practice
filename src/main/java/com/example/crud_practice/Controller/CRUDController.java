package com.example.crud_practice.Controller;

import com.example.crud_practice.DTO.CRUDDTO;
import com.example.crud_practice.Service.CRUDService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor

public class CRUDController {

    private final CRUDService crudService;

    @GetMapping("/")
    public String main(Model model){
        return "index";
    }

    @GetMapping("/list")
    public String CRUDList(Model model)throws Exception{
        List<CRUDDTO> cruddtos = crudService.readAll();

        model.addAttribute("cruddtos", cruddtos);

        return "/crud/list";
    }

    @GetMapping("/insert")
    public String insertForm() throws Exception{
        return "/crud/insert";
    }

    @PostMapping("/insert")
    public String insertProc(CRUDDTO cruddto) throws Exception{
        crudService.create(cruddto);
        return "redirect:/list";

    }

    @GetMapping("/update")
    private String updateForm(Long id, Model model)throws Exception{
        CRUDDTO cruddto = crudService.readOne(id);

        model.addAttribute("cruddto", cruddto);

        return "/crud/update";

    }

    @PostMapping("/update")
    public String updateProc(CRUDDTO cruddto)throws Exception{
        crudService.update(cruddto);
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(Long id) throws  Exception{
        crudService.delete(id);
        return "redirect:/list";
    }
}

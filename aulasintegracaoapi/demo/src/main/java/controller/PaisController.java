package controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.Pais;
import service.PaisService;

@RestController
@RequestMapping("/paises")
public class PaisController {

    private  final PaisService paisService;

    public PaisController (PaisService paisService){
        this.paisService = paisService;
    }


    @GetMapping("/todos")
    public List<Pais> getTodosPaises(){
        return paisService.getAllPaises();

    }

    

    
}

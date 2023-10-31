package com.example.demo.controller;

import java.util.Collections;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Pais;
import com.example.demo.service.PaisService;





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

    @GetMapping("/{id}")
    public List<Pais> getPaisPorId(@PathVariable Integer id) {
        List<Integer> idList = Collections.singletonList(id);
        return paisService.getPaisPorId(idList);

    }

   
    @PostMapping
    public Pais postPais(@RequestBody Pais pais) {
       return paisService.postNovoPais(pais);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePais(@PathVariable Integer id) {
        try {
            paisService.deletePais(id);
            return ResponseEntity.ok().build();
        } catch (Exception ex) {
            // Tratar exceções apropriadas aqui
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
        }
    }
         
   /* @DeleteMapping("/{id}")
        public ResponseEntity<Pais> deletePais(@PathVariable Long id) {
        paisService.deletePais(id);
        return ResponseEntity.noContent().build();

    }*/
        
            
        
    
}


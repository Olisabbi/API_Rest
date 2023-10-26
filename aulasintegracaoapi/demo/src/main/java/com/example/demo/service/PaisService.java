package com.example.demo.service;


import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.Pais;
import com.example.demo.repository.PaisRepository;

@Service
public class PaisService {

    private final PaisRepository paisRepository;

    public PaisService(PaisRepository paisRepository){
        this.paisRepository = paisRepository;
    }

    public List<Pais> getAllPaises() {
        return paisRepository.findAll();
    }

    public List<Pais> getPaisPorId(List<Integer> ids) {
        return paisRepository.findAllById(ids);
    }

    public Pais postNovoPais(Pais novoPais) {
        return paisRepository.save(novoPais);
        
    }

    public void deletePais(long id) {
        paisRepository.deleteAllById(null);
    }

    
    
}

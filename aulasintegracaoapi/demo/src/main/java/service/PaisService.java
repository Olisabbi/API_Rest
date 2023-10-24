package service;

import java.util.List;
import org.springframework.stereotype.Service;
import model.Pais;
import repository.PaisRepository;

@Service
public class PaisService {

    private final PaisRepository paisRepository;

    public PaisService(PaisRepository paisRepository){
        this.paisRepository = paisRepository;
    }

    public List<Pais> getAllPaises() {
        return paisRepository.findAll();
    }

    
    
}

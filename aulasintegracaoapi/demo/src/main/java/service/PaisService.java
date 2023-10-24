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

    public List<Pais> getPaisPorId(List<Long> ids) {
        return paisRepository.findAllById(null);
    }

    public Pais postNovoPais(Pais novoPais) {
        return paisRepository.save(novoPais);
        
    }

    public void deletePais(long id) {
        paisRepository.deleteAllById(null);
    }

    
    
}

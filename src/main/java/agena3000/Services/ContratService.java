package agena3000.Services;

import agena3000.Entity.Contrat;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public interface ContratService {
    void ajouterContrat(Contrat e);
    void updateContrat(Contrat e);
    List<Contrat> getAll();
    Contrat  retrieContrat (Integer id);
    void deleteContrat(Integer id);
    Contrat affectContratToEtudiant (Contrat ce, String nomE, String prenomE);
    Integer nbContratsValides(Date startDate,Date endDate);
}

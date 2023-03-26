package agena3000.Services;

import agena3000.Entity.Contrat;
import agena3000.Entity.Etudiant;
import agena3000.Repositories.ContratRepository;
import agena3000.Repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImp implements ContratService{

    private final ContratRepository contratRepository;
    private final EtudiantRepository etudiantRepository;
    @Override
    public void ajouterContrat(Contrat e) {

    }

    @Override
    public void updateContrat(Contrat e) {

    }

    @Override
    public List<Contrat> getAll() {
        return null;
    }

    @Override
    public Contrat retrieContrat(Integer id) {
        return null;
    }
    @Override
    public void deleteContrat(Integer id) {

    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
        Etudiant etudiant= etudiantRepository.findByNomEPrenomE(nomE, prenomE);
        if (etudiant!=null && etudiant.getContrats().size()<5)
        {
           ce.setEtudiant(etudiant);
           contratRepository.save(ce);
        }
        return ce;
    }

    @Override
    public Integer nbContratsValides(Date startDate, Date endDate) {
       List<Contrat>contrats =contratRepository.findAll();
       Integer compteur=0;
       for (Contrat contrat:contrats)
       {
           if (contrat.getDateDebutContrat().before(startDate)&&contrat.getDateFinContrat().after(endDate))
               compteur++;
       }
      return compteur;
    }
}

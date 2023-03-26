package agena3000.Services;

import agena3000.Entity.Contrat;
import agena3000.Entity.Departement;
import agena3000.Entity.Equipe;
import agena3000.Entity.Etudiant;
import agena3000.Repositories.ContratRepository;
import agena3000.Repositories.DepartementRepository;
import agena3000.Repositories.EquipeRepository;
import agena3000.Repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class IEtudiantServiceImp implements IEtudiantServices {
    @Autowired
    private DepartementRepository departementRepository;
    private EtudiantRepository etudiantRepository;
    private final ContratRepository contratRepository;
    private final EquipeRepository equipeRepository;

    @Override
    public void addEtudiant(Etudiant e) {
        etudiantRepository.save(e);
    }

    @Override
    public void updateEtudiant(Etudiant e) {
        etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> getAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public void deleteEtudiant(Integer id) {}

    @Override
    public Etudiant getById(Integer id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        // Etudiant etudiant = this.getById(etudiantId); //récuprer les objets
        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
        Departement departement = departementRepository.findById(departementId).orElse(null);
        //ici verifier les objets
        if ((etudiant != null) && (departement != null)) {
            etudiant.setDepartement(departement);//faire le traitement
            //departement.getEtu().add(etudiant);
            etudiantRepository.save(etudiant);//enregistrement (saving)
        }
    }
    @Override
    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        Assert.notNull(contrat, "universite must not be null.");
        Assert.notNull(equipe, "equipe must not be null.");
        List<Equipe> equipes = new ArrayList<>();
        equipes.add(equipe);
        e.setEquipes(equipes);
        etudiantRepository.saveAndFlush(e);
        contrat.setEtudiant(e);
        //contratRepository.save(contrat);
        return e;
    }
    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        Assert.notNull(departement,"departement not be null");
       // List<Etudiant> etud = departement.getEtudiants();
        return departement.getEtudiants();
    }
}

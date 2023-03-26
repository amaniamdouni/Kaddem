package agena3000.Services;

import agena3000.Entity.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IEtudiantServices {
    void addEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    List<Etudiant> getAll();
    void deleteEtudiant(Integer id);
    Etudiant getById(Integer id);
    void assignEtudiantToDepartement(Integer etudiantId, Integer departemenId);
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);
    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
}

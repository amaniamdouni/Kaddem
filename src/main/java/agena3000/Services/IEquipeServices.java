package agena3000.Services;

import agena3000.Entity.Equipe;
import agena3000.Entity.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IEquipeServices {
    void addEquipe(Equipe equipe);
    void updateEquipe(Etudiant equipe);
    List<Equipe> getAll();
    void deleteEquipe(Integer id);
    Equipe getById(Integer id);
}

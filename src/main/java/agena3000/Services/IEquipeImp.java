package agena3000.Services;

import agena3000.Entity.Equipe;
import agena3000.Entity.Etudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IEquipeImp implements IEquipeServices{
    @Override
    public void addEquipe(Equipe equipe) {

    }

    @Override
    public void updateEquipe(Etudiant equipe) {

    }

    @Override
    public List<Equipe> getAll() {
        return null;
    }

    @Override
    public void deleteEquipe(Integer id) {

    }

    @Override
    public Equipe getById(Integer id) {
        return null;
    }
}

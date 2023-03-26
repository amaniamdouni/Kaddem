package agena3000.Services;

import agena3000.Entity.Departement;
import agena3000.Entity.Universite;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IUniversiteServices {
    void addUniversite(Universite universite);
    void updateUniversite(Universite universite);
    List<Universite> getAll();
    void deleteUniversite(Integer id);
    Universite getById(Integer id);
    void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
    List<Departement> retrieveDepartementsByUniversite(Integer idUniversite);
}

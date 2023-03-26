package agena3000.Services;

import agena3000.Entity.Departement;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IDepartementServices {
    void addDepartement(Departement departement);
    void updateDepartement(Departement departement);
    List<Departement> getAll();
    void deleteDepartement(Integer id);
    Departement getById(Integer id);
}

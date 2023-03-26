package agena3000.Services;

import agena3000.Entity.Departement;
import agena3000.Repositories.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IDepartmentImp implements IDepartementServices{
    @Autowired
    private DepartementRepository departementRepository;
    @Override
    public void addDepartement(Departement departement) {

    }

    @Override
    public void updateDepartement(Departement departement) {

    }

    @Override
    public List<Departement> getAll() {
        return null;
    }

    @Override
    public void deleteDepartement(Integer id) {

    }

    @Override
    public Departement getById(Integer id) {
        return null;
    }

}

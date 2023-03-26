package agena3000.Services;

import agena3000.Entity.Departement;
import agena3000.Repositories.DepartementRepository;
import agena3000.Repositories.UniversiteRepository;
import agena3000.Entity.Universite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
@Service
public class IUniversiteImp implements IUniversiteServices{
    @Autowired
    private UniversiteRepository universiteRepository;
    private final DepartementRepository departementRepository;

    public IUniversiteImp(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }
    @Override
    public void addUniversite(Universite universite) {

    }

    @Override
    public void updateUniversite(Universite universite) {

    }

    @Override
    public List<Universite> getAll() {
        return null;
    }

    @Override
    public void deleteUniversite(Integer id) {

    }

    @Override
    public Universite getById(Integer id) {
        return null;
    }
    //@Transactional kif nhotou hethi me nhotouch (.save) idha me fama hata err t affecti idha fama err me taamel chy traja3 el 9dim eli aandna
    //taamel update manager entity
    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);

        Assert.notNull(universite, "universite must not be null.") ;
        Assert.notNull(departement, "departement must not be null.") ;
         // get tjib liste l 9dima w tzid aliha bel add l affectaion l jdida
        universite.getDepartements().add(departement);
        // save hata me famech manager entity tansaa wehed jdid idha fama t affecti fyh
        universiteRepository.save(universite);
    }

    @Override
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Assert.notNull(universite,"univ not null");
        return universite.getDepartements();
    }

}

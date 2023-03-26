package agena3000.Controllers;

import agena3000.Entity.Departement;
import agena3000.Repositories.UniversiteRepository;
import agena3000.Services.IUniversiteServices;
import agena3000.Entity.Universite;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("universite")
@RequiredArgsConstructor
public class UniversiteController {
    @Autowired
    IUniversiteServices iUniversiteServices;
    private final UniversiteRepository universiteRepository;
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome In My Unisersity";
    }
    @GetMapping("/getListUniv")
    public List<Universite> getAllUniversites()
    {
       return iUniversiteServices.getAll();
    }
    @GetMapping("/getUnivByID{id}")
    public Universite getID(@PathVariable int id)
    {
        return iUniversiteServices.getById(id);
    }
    @PostMapping("/addNewUniv")
    public void addUniversite(@RequestBody Universite universite)
    {
        iUniversiteServices.addUniversite(universite);
    }

    @PutMapping("/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable Integer idUniversite, @PathVariable Integer idDepartement) {
        iUniversiteServices.assignUniversiteToDepartement(idUniversite,idDepartement);
    }
    @GetMapping
    public List<Departement> retrieveDepartementsByUniversite(@PathVariable Integer idUniversite){
        return iUniversiteServices.retrieveDepartementsByUniversite(idUniversite);
    }

}

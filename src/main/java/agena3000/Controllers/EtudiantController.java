package agena3000.Controllers;

import agena3000.Entity.Etudiant;
import agena3000.Repositories.EquipeRepository;
import agena3000.Repositories.EtudiantRepository;
import agena3000.Services.IEtudiantServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//pour dire asna3li instance men service
@RequestMapping("etudiant")
@RequiredArgsConstructor
public class EtudiantController {
    @Autowired
    IEtudiantServices iEtudiantServices;
    private final EquipeRepository equipeRepository;
    private final EtudiantRepository etudiantRepository;
    /*@GetMapping("/HelloStud")
    public String Student()
    {
        return "Hello Students";
    }*/
    @GetMapping("/getAllEtudiant")
    public List<Etudiant> getAllEtudiant(){
        return iEtudiantServices.getAll();
    }
    @GetMapping("/getById{id}")
    public Etudiant getID(@PathVariable int id)
    {
        return iEtudiantServices.getById(id);
    }
    @PostMapping("/addEtudiant")
    public void addEtudiants(@RequestBody Etudiant etudiant)
    {
        iEtudiantServices.addEtudiant(etudiant);
    }
    @PostMapping("/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e, @PathVariable Integer idContrat, @PathVariable Integer idEquipe) {
        return iEtudiantServices.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idEquipe);

    }
    @GetMapping("/getEtudByDep")
    List<Etudiant> getEtudiantsByDepartement (@PathVariable Integer idDepartement){
        return iEtudiantServices.getEtudiantsByDepartement(idDepartement);

    }

}

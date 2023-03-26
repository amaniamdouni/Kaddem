package agena3000.Controllers;

import agena3000.Entity.Contrat;
import agena3000.Services.ContratService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Contrat")
@RequiredArgsConstructor
public class ContratController {
    @Autowired
    ContratService contratService;

    @GetMapping("/getALLContrat")
    public List<Contrat> getAll() {
        return contratService.getAll();
    }

    @DeleteMapping("/{id}")
    private void deletecontrat(@PathVariable int id) {
        contratService.deleteContrat(id);
    }

    @PostMapping()
    public void ajouterContrat(@RequestBody Contrat contrat) {
        contratService.ajouterContrat(contrat);
    }

    @PutMapping()
    private Contrat updateContrat(@RequestBody Contrat contrat) {
        contratService.updateContrat(contrat);
        return contrat;
    }

    @PostMapping
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
        contratService.affectContratToEtudiant(ce, nomE, prenomE);
        return ce;
    }
}

package agena3000.Controllers;

import agena3000.Entity.Equipe;
import agena3000.Services.IEquipeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/equipe")
public class EquipeController {
    @Autowired
    IEquipeServices iEquipeServices;
    @GetMapping("/helloWorld!")
    public String helloWorld(){
        return "Mrs. Amdouni says hello to her co-workers";
    }
    @GetMapping("/getAllEquipe")
    public List<Equipe> getAllEquipe()
    {
        return iEquipeServices.getAll();
    }
    @GetMapping("/getById{id}")
    public Equipe getID(@PathVariable int id)
    {
        return iEquipeServices.getById(id);
    }
    @PostMapping("/addEquipe")
    public void addEquipe(@RequestBody Equipe equipe)
    {
        iEquipeServices.addEquipe(equipe);
    }
}

package agena3000.Controllers;

import agena3000.Entity.Departement;
import agena3000.Services.IDepartementServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/departmenet")
public class DepartementController {
    @Autowired
    IDepartementServices iDepartementServices;
    @GetMapping("/Bonjour")
    public String Bonjour(){
        return "Welcome to IT Departement";
    }
    @GetMapping("/getAlDep")
    public List<Departement> getAllDemartement()
    {
        return iDepartementServices.getAll();
    }
    @GetMapping("/getById{id}")
    public Departement getID(@PathVariable int id)
    {
        return iDepartementServices.getById(id);
    }
    @PostMapping("/addDep")
    public void addDepartement(@RequestBody Departement departement)
    {
        iDepartementServices.addDepartement(departement);
    }
}

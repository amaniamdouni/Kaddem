package agena3000.Repositories;

import agena3000.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository <Etudiant,Integer> {
    // l objet eli bech yarjaa nemchi lele repo mteou w nekhdem fyh methode (affect contrat to etudiant)
    Etudiant findByNomEPrenomE(String nomE, String prenomE);

}

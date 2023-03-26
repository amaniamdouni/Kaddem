package agena3000.Repositories;

import agena3000.Entity.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {
     Contrat findByDate(LocalDate startDate, LocalDate endDate);
}

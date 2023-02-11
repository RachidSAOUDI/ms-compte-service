package ma.usmba.mscompteservice.repositories;

import ma.usmba.mscompteservice.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}

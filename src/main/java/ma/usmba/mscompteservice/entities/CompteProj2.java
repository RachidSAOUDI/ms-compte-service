package ma.usmba.mscompteservice.entities;

import ma.usmba.mscompteservice.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p2",types = Compte.class)
public interface CompteProj2 {
    Long getCode();
    TypeCompte getType();
}

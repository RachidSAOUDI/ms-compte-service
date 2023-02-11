package ma.usmba.mscompteservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types = Compte.class)
public interface CompteProj1 {
    Long getCode();
    double getSolde();
}

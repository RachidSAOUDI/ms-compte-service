package ma.usmba.mscompteservice;

import ma.usmba.mscompteservice.entities.Compte;
import ma.usmba.mscompteservice.enums.TypeCompte;
import ma.usmba.mscompteservice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class MsCompteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCompteServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository, RepositoryRestConfiguration repositoryRestConfiguration){
        return args -> {
            repositoryRestConfiguration.exposeIdsFor(Compte.class);
            compteRepository.save(new Compte(null,10000,new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null,15000,new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null,12000,new Date(), TypeCompte.COURANT));
            compteRepository.findAll().forEach(compte -> {
                System.out.println(compte.getType());
                System.out.println(compte.getSolde());
            });
        };
    }
}

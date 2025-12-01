package fr.eni.projetcasse;

import fr.eni.projetcasse.service.Service1;
import fr.eni.projetcasse.service.Service2;
import fr.eni.service3.Service3;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DisplayComponent {
    private Service1 service1;
    private Service2 service2;
    private Service3 service3;

    /**
     * Constructeur qui va faire l'injection de dépendances
     * @param service1
     * @param service2
     * @param service3
     */
    public DisplayComponent(Service1 service1, Service2 service2, Service3 service3) {
        this.service1 = service1;
        this.service2 = service2;
        this.service3 = service3;
    }

    @PostConstruct
    public void init() {
        System.out.println("****************************************");
        System.out.println(service1.fonctionnalite1());
        System.out.println(service1.fonctionnalite2());
        System.out.println(service2.fonctionnalite1());
        System.out.println(service2.fonctionnalite2());
        System.out.println(service3.fonctionnalite3());
        System.out.println("****************************************");
    }
}

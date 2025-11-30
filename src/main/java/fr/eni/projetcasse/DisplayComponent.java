package fr.eni.projetcasse;

import fr.eni.projetcasse.service.Service1;
import fr.eni.projetcasse.service.Service2;
import fr.eni.service3.Service3;
import jakarta.annotation.PostConstruct;

public class DisplayComponent {
    private Service1 service1;
    private Service2 service2;
    private Service3 service3;

    @PostConstruct
    public void init() {
        System.out.println("****************************************");
        System.out.println("APPEL DE LA FONCTIONALITE 1 DU SERVICE 1");
        System.out.println(service1.fonctionnalite1());
        System.out.println("APPEL DE LA FONCTIONALITE 2 DU SERVICE 1");
        System.out.println(service1.fonctionnalite2());
        System.out.println("APPEL DE LA FONCTIONALITE 1 DU SERVICE 2");
        System.out.println(service2.fonctionnalite1());
        System.out.println("APPEL DE LA FONCTIONALITE 2 DU SERVICE 2");
        System.out.println(service2.fonctionnalite2());
        System.out.println("APPEL DE LA FONCTIONALITE 3 DU SERVICE 3");
        System.out.println(service3.fonctionnalite3());
        System.out.println("****************************************");
    }
}

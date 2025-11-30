package fr.eni.projetcasse.service.impl;

import fr.eni.projetcasse.service.Service1;
import fr.eni.projetcasse.service.Service2;

public class Service1Impl1 implements Service1 {

    private Service2 service2;

    @Override
    public String fonctionnalite1() {
        return "Fonctionnalite1 du service 1 fonctionnelle !";
    }

    @Override
    public String fonctionnalite2() {
        return "Appel depuis le Service 1 au service 2 : " + service2.fonctionnalite2();
    }
}

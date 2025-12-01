package fr.eni.projetcasse.service.impl;

import fr.eni.projetcasse.service.Service2;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class Service2Impl2 implements Service2 {
    @Override
    public String fonctionnalite1() {
        return "Fonctionnalite1 fonctionnelle !";
    }

    @Override
    public String fonctionnalite2() {
        return "Fonctionnalite2 fonctionnelle";
    }


}

package fr.eni.projetcasse.service.impl;

import fr.eni.projetcasse.service.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class Service2Impl1 implements Service2 {

    @Override
    public String fonctionnalite1() {
        return "Fonctionnalite1 fonctionnelle !";
    }

    @Override
    public String fonctionnalite2() {
        return "Ca n'est pas cette fonctionnalité qu'il fallait appeler !!!!!!!";
    }
}

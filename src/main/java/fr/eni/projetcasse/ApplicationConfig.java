package fr.eni.projetcasse;

import fr.eni.service3.Service3;
import fr.eni.service3.impl.Service3Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    /***
     * TODO : possibilité d'ajouter des beans
     */

    /**
     * Je vais définir un Bean de type Service3 dans le contexte Spring
     * @return
     */
    @Bean
    public Service3 service3(){
        return new Service3Impl();
    }
}
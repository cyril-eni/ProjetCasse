package fr.eni.projetcasse.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAdvice.class);

    /**
     * Je cherche à écrire une nouvelle ligne de log à l'éxécution de chaque méthode
     * - d'un package qui commence par fr.eni
     * - pour une classe qui commence par Service
     */
    @Around("execution(* fr.eni.*.*.Service*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        // joinPoint.getSignature() m'affiche la référence de la méthode qui a déclenché l'appel (joinpoint)
        System.out.println("APPEL DE LA " + joinPoint.getSignature().getName().toUpperCase() + " DU " + joinPoint.getTarget().getClass().getSimpleName().toUpperCase());
        return proceed;
    }
}
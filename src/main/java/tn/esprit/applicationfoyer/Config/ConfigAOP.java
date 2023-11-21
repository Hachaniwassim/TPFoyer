package tn.esprit.applicationfoyer.Config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Aspect
public class ConfigAOP {
    @Before("execution(* tn.esprit.applicationfoyer.service.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

    @After("execution(* tn.esprit.applicationfoyer.service.*.*(..))")
    public void logoutMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Out method " + name + " : ");
    }


    @Before("execution(* tn.esprit.applicationfoyer.service.*.retrieve*())")
    public void logMessageMethodEntry() {
        log.info("Bonjour");
    }
}

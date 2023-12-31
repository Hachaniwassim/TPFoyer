package tn.esprit.applicationfoyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ApplicationFoyerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationFoyerApplication.class, args);
    }

}

package one.digitalinnovation.gof;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import one.digitalinnovation.gof.service.impl.ClienteServiceImpl;
import one.digitalinnovation.gof.service.observer.EmailObserver;
import one.digitalinnovation.gof.service.observer.SmsObserver;

import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner run(ClienteServiceImpl clienteService) {
        return args -> {
            clienteService.addObserver(new EmailObserver());
            clienteService.addObserver(new SmsObserver());
        };
    }
}

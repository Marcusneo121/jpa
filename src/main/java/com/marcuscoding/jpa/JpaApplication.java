package com.marcuscoding.jpa;

import com.marcuscoding.jpa.models.Author;
import com.marcuscoding.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    //    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository repository
    ) {
        return args -> {
            var author = Author.builder()
                    .firstName("Marcus")
                    .lastName("Neo")
                    .age(24)
                    .email("marcus121neo@gmail.com")
                    .build();
            repository.save(author);
        };
    }
}

package com.dicedicebaby.config;

import com.dicedicebaby.model.Card;
import com.dicedicebaby.repository.CardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSeeder {

    @Bean
    public CommandLineRunner seedDatabase(CardRepository cardRepository) {
        return args -> {
            if (cardRepository.count() == 0) {
                cardRepository.save(new Card("Paire de 1", "green", 1, 1));
                cardRepository.save(new Card("Paire de 2", "green", 1, 1));
                cardRepository.save(new Card("Paire de 3", "green", 1, 1));
                cardRepository.save(new Card("Paire de 4", "green", 1, 1));
                cardRepository.save(new Card("Paire de 5", "green", 1, 1));
                cardRepository.save(new Card("Paire de 6", "green", 1, 1));
                cardRepository.save(new Card("Double paire", "green", 2, 3));

                cardRepository.save(new Card("Brelan de 1", "blue", 1, 2));
                cardRepository.save(new Card("Brelan de 2", "blue", 1, 2));
                cardRepository.save(new Card("Brelan de 3", "blue", 1, 2));
                cardRepository.save(new Card("Brelan de 4", "blue", 1, 2));
                cardRepository.save(new Card("Brelan de 5", "blue", 1, 2));
                cardRepository.save(new Card("Brelan de 6", "blue", 1, 2));

                cardRepository.save(new Card("Que des pairs", "red", 2, 3));
                cardRepository.save(new Card("Que des impairs", "red", 2, 3));
                cardRepository.save(new Card("12, 13, 14", "red", 2, 3));
                cardRepository.save(new Card("21, 22, 23", "red", 2, 3));
                cardRepository.save(new Card("Tous différents", "red", 3, 3));
                cardRepository.save(new Card("<= 9", "red", 3, 4));
                cardRepository.save(new Card("<= 26", "red", 3, 4));
                cardRepository.save(new Card("Petite suite", "red", 3, 4));
                cardRepository.save(new Card("Grande suite", "red", 3, 4));
                cardRepository.save(new Card("Full", "red", 3, 4));
                cardRepository.save(new Card("Carré", "red", 3, 4));
                cardRepository.save(new Card("Yam's", "red", 4, 6));

                System.out.println("Database seeded.");
            }
        };
    }
}

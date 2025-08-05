package com.dicedicebaby.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "players")
public class Player {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @Column(name = "hand")
    private List<Integer> hand;

    @Column(name = "score")
    private int score;

    @Column(name = "nb_of_pieces")
    private int nbOfPieces;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


    // Constructors
    public Player() {
    }

    public Player(User user, Game game, List<Integer> hand, int score, int nbOfPieces) {
        this.user = user;
        this.game = game;
        this.hand = hand;
        this.score = score;
        this.nbOfPieces = nbOfPieces;
    }


    // Getters, Setters
    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<Integer> getHand() {
        return hand;
    }

    public void setHand(List<Integer> hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNbOfPieces() {
        return nbOfPieces;
    }

    public void setNbOfPieces(int nbOfPieces) {
        this.nbOfPieces = nbOfPieces;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}

package com.logone.katseacademy.entities;
import jakarta.persistence.*;

@Entity
@Table(name= "tb_question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_question;
    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "id_quiz")
    private Long id_quiz;

    public Question(Long id_question, String titre, Long id_quiz) {
        this.id_question = id_question;
        this.titre = titre;
        this.id_quiz = id_quiz;
    }

    public Long getId_question() {
        return id_question;
    }

    public void setId_question(Long id_question) {
        this.id_question = id_question;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Long getId_quiz() {
        return id_quiz;
    }

    public void setId_quiz(Long id_quiz) {
        this.id_quiz = id_quiz;
    }
}

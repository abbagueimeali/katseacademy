package com.logone.katseacademy.entities;
import jakarta.persistence.*;

@Entity
@Table(name= "tb_quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_quiz;
    @Column(name = "code_quiz", nullable = false)
    private String code_quiz;

    @Column(name = "id_cours")
    private Long id_cours;

    public Quiz(Long id_quiz, String code_quiz, Long id_cours) {
        this.id_quiz = id_quiz;
        this.code_quiz = code_quiz;
        this.id_cours = id_cours;
    }

    public Long getId_quiz() {
        return id_quiz;
    }

    public void setId_quiz(Long id_quiz) {
        this.id_quiz = id_quiz;
    }

    public String getCode_quiz() {
        return code_quiz;
    }

    public void setCode_quiz(String code_quiz) {
        this.code_quiz = code_quiz;
    }

    public Long getId_cours() {
        return id_cours;
    }

    public void setId_cours(Long id_cours) {
        this.id_cours = id_cours;
    }
}

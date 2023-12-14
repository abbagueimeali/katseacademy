package com.logone.katseacademy.entities;
import jakarta.persistence.*;

@Entity
@Table(name= "tb_reponse")
public class Reponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reponse;
    @Column(name = "titre", nullable = false)
    private String titre;


    @Column(name = "valeur")
    private Integer valeur;

    @Column(name = "int_question")
    private Long int_question;

    public Reponse(Long id_reponse, String titre, Integer valeur, Long int_question) {
        this.id_reponse = id_reponse;
        this.titre = titre;
        this.valeur = valeur;
        this.int_question = int_question;
    }

    public Long getId_reponse() {
        return id_reponse;
    }

    public void setId_reponse(Long id_reponse) {
        this.id_reponse = id_reponse;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    public Long getInt_question() {
        return int_question;
    }

    public void setInt_question(Long int_question) {
        this.int_question = int_question;
    }
}

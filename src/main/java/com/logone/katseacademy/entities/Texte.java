package com.logone.katseacademy.entities;
import jakarta.persistence.*;

@Entity
@Table(name= "tb_texte")
public class Texte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_texte;
    @Column(name = "texte", nullable = false)
    private String texte;

    @Column(name = "id_cours")
    private Long id_cours;

    public Texte(Long id_texte, String texte, Long id_cours) {
        this.id_texte = id_texte;
        this.texte = texte;
        this.id_cours = id_cours;
    }

    public Long getId_texte() {
        return id_texte;
    }

    public void setId_texte(Long id_texte) {
        this.id_texte = id_texte;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Long getId_cours() {
        return id_cours;
    }

    public void setId_cours(Long id_cours) {
        this.id_cours = id_cours;
    }
}

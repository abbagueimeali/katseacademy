package com.logone.katseacademy.entities;
import jakarta.persistence.*;

@Entity
@Table(name= "tb_audio")
public class Audio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_audio;
    @Column(name = "texte", nullable = false)
    private String texte;

    @Column(name = "id_cours")
    private Long id_cours;

    public Audio(Long id_audio, String texte, Long id_cours) {
        this.id_audio = id_audio;
        this.texte = texte;
        this.id_cours = id_cours;
    }

    public Long getId_audio() {
        return id_audio;
    }

    public void setId_audio(Long id_audio) {
        this.id_audio = id_audio;
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

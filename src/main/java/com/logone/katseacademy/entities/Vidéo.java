package com.logone.katseacademy.entities;
import jakarta.persistence.*;

@Entity
@Table(name= "tb_video")
public class Vidéo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_video;
    @Column(name = "texte", nullable = false)
    private String texte;

    @Column(name = "id_cours")
    private Long id_cours;

    public Vidéo(Long id_video, String texte, Long id_cours) {
        Id_video = id_video;
        this.texte = texte;
        this.id_cours = id_cours;
    }

    public Long getId_video() {
        return Id_video;
    }

    public void setId_video(Long id_video) {
        Id_video = id_video;
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

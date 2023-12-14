package com.logone.katseacademy.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "tb_cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titre_cours", nullable = false)
    private String titre_cours;

    @Column(name = "id_cat_cours")
    private Long id_cat_cours;

    public Cours(Long id, String titre_cours, Long id_cat_cours) {
        this.id = id;
        this.titre_cours = titre_cours;
        this.id_cat_cours = id_cat_cours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre_cours() {
        return titre_cours;
    }

    public void setTitre_cours(String titre_cours) {
        this.titre_cours = titre_cours;
    }

    public Long getId_cat_cours() {
        return id_cat_cours;
    }

    public void setId_cat_cours(Long id_cat_cours) {
        this.id_cat_cours = id_cat_cours;
    }
}

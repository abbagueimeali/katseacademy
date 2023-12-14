package com.logone.katseacademy.entities;
import jakarta.persistence.*;

@Entity
@Table(name= "tb_cat_cours")
public class Cat_cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cat_cours;
    @Column(name = "titre_cat_cours", nullable = false)
    private String titre_cat_cours;

    public Cat_cours(Long id_cat_cours, String titre_cat_cours) {
        this.id_cat_cours = id_cat_cours;
        this.titre_cat_cours = titre_cat_cours;
    }

    public Long getId_cat_cours() {
        return id_cat_cours;
    }

    public void setId_cat_cours(Long id_cat_cours) {
        this.id_cat_cours = id_cat_cours;
    }

    public String getTitre_cat_cours() {
        return titre_cat_cours;
    }

    public void setTitre_cat_cours(String titre_cat_cours) {
        this.titre_cat_cours = titre_cat_cours;
    }
}

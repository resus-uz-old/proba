package uz.resus.yangi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mahsulot{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nom;
    private int narx;

    public Mahsulot() {
    }

    public Mahsulot(Long id, String nom, int narx) {
        this.id = id;
        this.nom = nom;
        this.narx = narx;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNarx() {
        return narx;
    }

    public void setNarx(int narx) {
        this.narx = narx;
    }
}
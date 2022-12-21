
package org.webp;

import javax.persistence.*;
import java.util.List;

@Table(name = "MUSTERI")
@Entity
public class Musteri {

    @Column(name = "Musteri ID") @Id @GeneratedValue
    private long mus_ID;

    @Column(name = "Musteri Isim")
    private String isim;

    @Column(name = "Musteri Adres")
    private String mus_adres;

    @Column(name = "Musteri Telefon")
    private long telefon;

    @Column(name = "Musteri Mail")
    private String mail;

    @OneToMany(mappedBy = "musteris")
    private List<Kargo> kargo;

    @ManyToMany
    private List<Firma> firmaList;

    public Musteri(){}

    public long getMus_ID() {
        return mus_ID;
    }

    public void setMus_ID(long mus_ID) {
        this.mus_ID = mus_ID;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMus_adres() {
        return mus_adres;
    }

    public void setMus_adres(String mus_adres) {
        this.mus_adres = mus_adres;
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Kargo> getKargo() {
        return kargo;
    }

    public void setKargo(List<Kargo> kargo) {
        this.kargo = kargo;
    }

    public List<Firma> getFirmaList() {
        return firmaList;
    }

    public void setFirmaList(List<Firma> firmaList) {
        this.firmaList = firmaList;
    }
}

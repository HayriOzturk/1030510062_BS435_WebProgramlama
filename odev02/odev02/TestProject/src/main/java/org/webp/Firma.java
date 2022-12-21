package org.webp;

import javax.persistence.*;
import java.util.List;

@Table(name = "FIRMA")
@Entity
public class Firma {

    @Column(name = "Firma ID") @Id @GeneratedValue
    private long firma_ID;

    @Column(name = "Isletme Numarası")
    private long isletme_no;

    @Column(name = "Firma Adi")
    private String isim;

    @Column(name = "Firma Adres")
    private String fir_adres;

    @Column(name = "Firma Telefon")
    private long telefon;

    @Column(name = "Firma Mail")
    private String mail;

    @OneToMany(mappedBy = "firmas")
    private List<Kargo> kargo;

    @ManyToMany
    private List<Musteri> musteriList;

    public Firma(){}

    public long getFirma_ID() {
        return firma_ID;
    }

    public void setFirma_ID(long firma_ID) {
        this.firma_ID = firma_ID;
    }

    public long getIsletme_no() {
        return isletme_no;
    }

    public void setIsletme_no(long isletme_no) {
        this.isletme_no = isletme_no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getFir_adres() {
        return fir_adres;
    }

    public void setFir_adres(String fir_adres) {
        this.fir_adres = fir_adres;
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

    public List<Musteri> getMusteriList() {
        return musteriList;
    }

    public void setMusteriList(List<Musteri> musteriList) {
        this.musteriList = musteriList;
    }
}

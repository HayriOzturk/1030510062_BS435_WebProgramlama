package org.webp;


import javax.persistence.*;


/*
    "MovieDetails" isimi bir tablo bulunmamaktadir o yuzden hangi tablo maplenecek
    belirtmek gerekmektedir
 */
@Table(name = "KARGO")
@Entity
public class Kargo {

    @Column(name = "Kargo ID") @Id @GeneratedValue
    private long kargo_ID;

    @Column(name = "Kargo Agirlik")
    private int agirlik;

    @Column(name = "Gonderici Adres")
    private String gonder_adres;

    @Column(name = "Alici Adres")
    private String alici_adres;

    @Column(name = "Takip Kodu")
    private long takip_no;

    @Column(name = "Kargo Cins")
    private String cins;

    @Column(name = "Firma ID") @ManyToOne()
    private Firma firmas;

    @Column(name = "Musteri ID") @ManyToOne()
    private Musteri musteris;

    public Kargo(){}

    public long getKargo_ID() {
        return kargo_ID;
    }

    public void setKargo_ID(long kargo_ID) {
        this.kargo_ID = kargo_ID;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getGonder_adres() {
        return gonder_adres;
    }

    public void setGonder_adres(String gonder_adres) {
        this.gonder_adres = gonder_adres;
    }

    public String getAlici_adres() {
        return alici_adres;
    }

    public void setAlici_adres(String alici_adres) {
        this.alici_adres = alici_adres;
    }

    public long getTakip_no() {
        return takip_no;
    }

    public void setTakip_no(long takip_no) {
        this.takip_no = takip_no;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public Firma getFirmas() {
        return firmas;
    }

    public void setFirmas(Firma firmas) {
        this.firmas = firmas;
    }

    public Musteri getMusteris() {
        return musteris;
    }

    public void setMusteris(Musteri musteris) {
        this.musteris = musteris;
    }
}
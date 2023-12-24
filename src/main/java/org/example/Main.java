package org.example;

// EvSahibi sınıfı
class EvSahibi {
    private String ad;
    private String soyad;
    private Kiraci kiraci; // Kiraci sınıfına referans

    public EvSahibi(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public void setKiraci(Kiraci kiraci) {
        this.kiraci = kiraci;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void displayInfo() {
        System.out.println("Ev Sahibi: " + ad + " " + soyad);
        if (kiraci != null) {
            System.out.println("Kiracısı: " + kiraci.getAd() + " " + kiraci.getSoyad());
        }
    }
}

// Kiraci sınıfı
class Kiraci {
    private String ad;
    private String soyad;
    private EvSahibi evSahibi; // EvSahibi sınıfına referans

    public Kiraci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public void setEvSahibi(EvSahibi evSahibi) {
        this.evSahibi = evSahibi;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void displayInfo() {
        System.out.println("Kiracı: " + ad + " " + soyad);
        if (evSahibi != null) {
            System.out.println("Ev Sahibi: " + evSahibi.getAd() + " " + evSahibi.getSoyad());
        }
    }
}

// Konut sınıfı
class Konut {
    private String adres;
    private EvSahibi evSahibi;

    public Konut(String adres, EvSahibi evSahibi) {
        this.adres = adres;
        this.evSahibi = evSahibi;
    }

    public void displayInfo() {
        System.out.println("Adres: " + adres);
        evSahibi.displayInfo();
    }
}

// Daire sınıfı, Konut sınıfından türemiştir
class Daire extends Konut {
    private int daireNumarasi;

    public Daire(String adres, EvSahibi evSahibi, int daireNumarasi) {
        super(adres, evSahibi);
        this.daireNumarasi = daireNumarasi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Daire Numarası: " + daireNumarasi);
    }
}

// Bina sınıfı, Konut sınıfından türemiştir
class Bina extends Konut {
    private int numberOfFloors;

    public Bina(String adres, EvSahibi evSahibi, int numberOfFloors) {
        super(adres, evSahibi);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kat Sayısı: " + numberOfFloors);
    }
}

// Main sınıfı
public class Main {
    public static void main(String[] args) {
        // Örnek kullanım
        EvSahibi evSahibi1 = new EvSahibi("Ahmet", "Yılmaz");
        Kiraci kiraci = new Kiraci("Mehmet", "Demir");

        evSahibi1.setKiraci(kiraci);
        kiraci.setEvSahibi(evSahibi1);

        Konut konut = new Konut("Akalar Mah. Zambak Sokak No :7", evSahibi1);
        konut.displayInfo();

        Daire daire = new Daire("Akalar Mah. Zambak Sokak No :7", evSahibi1, 101);
        daire.displayInfo();

        Bina bina = new Bina("Anadolu Cad. 567 Sk. No: 10", evSahibi1, 5);
        bina.displayInfo();
    }
}

package com.example.amg_tennis_club_android;

public class Item {
    String nume;
    String email;
    String specialitate;
    String varsta;
    int image;

    public Item(String nume, String email, String specialitate, String varsta, int image) {
        this.nume = nume;
        this.email = email;
        this.specialitate = specialitate;
        this.varsta = varsta;
        this.image = image;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public String getSpecialitate() {
        return specialitate;
    }

    public String getVarsta() {
        return varsta;
    }

    public int getImage() {
        return image;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSpecialitate(String specialitate) {
        this.specialitate = specialitate;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

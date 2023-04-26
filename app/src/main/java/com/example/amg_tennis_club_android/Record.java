package com.example.amg_tennis_club_android;

public class Record {
    String nume;
    String email;
    String varsta;

    public Record(String nume, String email, String varsta) {
        this.nume = nume;
        this.email = email;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }
}

package com.aurat_xray.aurat_xray;

public class Docteur {

    private String Codedocteur;
    private String Nomdocteur;
    private String Prenomdocteur;
    private String Teleponedocteur;
    private String Motdepassedocteur;


    public Docteur() {
    }

    public Docteur(String codedocteur, String nomdocteur, String prenomdocteur, String teleponedocteur, String motdepassedocteur) {
        Codedocteur = codedocteur;
        Nomdocteur = nomdocteur;
        Prenomdocteur = prenomdocteur;
        Teleponedocteur = teleponedocteur;
        Motdepassedocteur = motdepassedocteur;
    }

    public String getCodedocteur() {
        return Codedocteur;
    }

    public void setCodedocteur(String codedocteur) {
        Codedocteur = codedocteur;
    }

    public String getNomdocteur() {
        return Nomdocteur;
    }

    public void setNomdocteur(String nomdocteur) {
        Nomdocteur = nomdocteur;
    }

    public String getPrenomdocteur() {
        return Prenomdocteur;
    }

    public void setPrenomdocteur(String prenomdocteur) {
        Prenomdocteur = prenomdocteur;
    }

    public String getTeleponedocteur() {
        return Teleponedocteur;
    }

    public void setTeleponedocteur(String teleponedocteur) {
        Teleponedocteur = teleponedocteur;
    }

    public String getMotdepassedocteur() {
        return Motdepassedocteur;
    }

    public void setMotdepassedocteur(String motdepassedocteur) {
        Motdepassedocteur = motdepassedocteur;
    }
}

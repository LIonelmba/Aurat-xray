package com.aurat_xray.aurat_xray;

import java.util.Date;

public class Structure {
    private String Codestructure;
    private String Nomstructure;
    private String Telephonestructure;
    private String Motdepassestructure;
    private String Cheminlogostructure;

    public Structure() {
    }

    public Structure(String codestructure, String nomstructure, String telephonestructure, String motdepassestructure, String cheminlogostructure) {
        Codestructure = codestructure;
        Nomstructure = nomstructure;
        Telephonestructure = telephonestructure;
        Motdepassestructure = motdepassestructure;
        Cheminlogostructure = cheminlogostructure;
    }

    public String getCodestructure() {
        return Codestructure;
    }

    public void setCodestructure(String codestructure) {
        Codestructure = codestructure;
    }

    public String getNomstructure() {
        return Nomstructure;
    }

    public void setNomstructure(String nomstructure) {
        Nomstructure = nomstructure;
    }

    public String getTelephonestructure() {
        return Telephonestructure;
    }

    public void setTelephonestructure(String telephonestructure) {
        Telephonestructure = telephonestructure;
    }

    public String getMotdepassestructure() {
        return Motdepassestructure;
    }

    public void setMotdepassestructure(String motdepassestructure) {
        Motdepassestructure = motdepassestructure;
    }

    public String getCheminlogostructure() {
        return Cheminlogostructure;
    }

    public void setCheminlogostructure(String cheminlogostructure) {
        Cheminlogostructure = cheminlogostructure;
    }
}

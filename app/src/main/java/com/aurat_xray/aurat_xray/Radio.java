package com.aurat_xray.aurat_xray;

import java.util.Date;

public class Radio {
    private String Coderadio;
    private String Cheminradio;
    private String Cheminbon;
    private String Cheminquittance;
    private Date Dateradio;
    private String Commentaireradio;
    private Boolean Interpreterradio=false;
    private String Codestructureradio;
    private String Codedocteurradio;

    public Radio() {
    }

    public Radio(String coderadio, String cheminradio, String cheminbon, String cheminquittance, Date dateradio, String commentaireradio, Boolean interpreterradio, String codestructureradio, String codedocteurradio) {
        Coderadio = coderadio;
        Cheminradio = cheminradio;
        Cheminbon = cheminbon;
        Cheminquittance = cheminquittance;
        Dateradio = dateradio;
        Commentaireradio = commentaireradio;
        Interpreterradio = interpreterradio;
        Codestructureradio = codestructureradio;
        Codedocteurradio = codedocteurradio;
    }


    public String getCoderadio() {
        return Coderadio;
    }

    public void setCoderadio(String coderadio) {
        Coderadio = coderadio;
    }

    public String getCheminradio() {
        return Cheminradio;
    }

    public void setCheminradio(String cheminradio) {
        Cheminradio = cheminradio;
    }

    public String getCheminbon() {
        return Cheminbon;
    }

    public void setCheminbon(String cheminbon) {
        Cheminbon = cheminbon;
    }

    public String getCheminquittance() {
        return Cheminquittance;
    }

    public void setCheminquittance(String cheminquittance) {
        Cheminquittance = cheminquittance;
    }

    public Date getDateradio() {
        return Dateradio;
    }

    public void setDateradio(Date dateradio) {
        Dateradio = dateradio;
    }

    public String getCommentaireradio() {
        return Commentaireradio;
    }

    public void setCommentaireradio(String commentaireradio) {
        Commentaireradio = commentaireradio;
    }

    public Boolean getInterpreterradio() {
        return Interpreterradio;
    }

    public void setInterpreterradio(Boolean interpreterradio) {
        Interpreterradio = interpreterradio;
    }

    public String getCodestructureradio() {
        return Codestructureradio;
    }

    public void setCodestructureradio(String codestructureradio) {
        Codestructureradio = codestructureradio;
    }

    public String getCodedocteurradio() {
        return Codedocteurradio;
    }

    public void setCodedocteurradio(String codedocteurradio) {
        Codedocteurradio = codedocteurradio;
    }
}

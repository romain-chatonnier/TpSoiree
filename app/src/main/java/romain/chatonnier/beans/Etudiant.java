package romain.chatonnier.beans;

import java.text.DateFormat;

public class Etudiant {
    private String nomEtu;
    private String prenomEtu;
    private DateFormat ddnEtu;
    private String mailEtu;
    private String loginEtu;
    private String passwordEtu;
    private boolean orgaEtu;

    public Etudiant(String nomEtu, String prenomEtu, DateFormat ddnEtu, String mailEtu, String loginEtu, String passwordEtu, boolean orgaEtu) {
        this.nomEtu = nomEtu;
        this.prenomEtu = prenomEtu;
        this.ddnEtu = ddnEtu;
        this.mailEtu = mailEtu;
        this.loginEtu = loginEtu;
        this.passwordEtu = passwordEtu;
        this.orgaEtu = orgaEtu;
    }

    public String getNomEtu() {
        return nomEtu;
    }

    public String getPrenomEtu() {
        return prenomEtu;
    }

    public DateFormat getDdnEtu() {
        return ddnEtu;
    }

    public String getMailEtu() {
        return mailEtu;
    }

    public String getLoginEtu() {
        return loginEtu;
    }

    public String getPasswordEtu() {
        return passwordEtu;
    }

    public boolean isOrgaEtu() {
        return orgaEtu;
    }
}

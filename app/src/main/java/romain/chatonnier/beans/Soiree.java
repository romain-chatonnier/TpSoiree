package romain.chatonnier.beans;

import java.text.DateFormat;

public class Soiree {
    private String libelleSoir;
    private String DescSoir;
    private DateFormat dateSoir;
    private Float DebutSoir;
    private String AdreSoir;
    private Double latSoir;
    private Double longSoir;

    public Soiree(String libelleSoir, String descSoir, DateFormat dateSoir, Float debutSoir, String adreSoir, Double latSoir, Double longSoir) {
        this.libelleSoir = libelleSoir;
        DescSoir = descSoir;
        this.dateSoir = dateSoir;
        DebutSoir = debutSoir;
        AdreSoir = adreSoir;
        this.latSoir = latSoir;
        this.longSoir = longSoir;
    }

    public String getLibelleSoir() {
        return libelleSoir;
    }

    public String getDescSoir() {
        return DescSoir;
    }

    public DateFormat getDateSoir() {
        return dateSoir;
    }

    public Float getDebutSoir() {
        return DebutSoir;
    }

    public String getAdreSoir() {
        return AdreSoir;
    }

    public Double getLatSoir() {
        return latSoir;
    }

    public Double getLongSoir() {
        return longSoir;
    }
}

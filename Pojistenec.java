/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni2;

/**
 *
 * @author filipmacik
 */
public class Pojistenec {
    
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int cislo;
    
    public Pojistenec(String jmeno, String prijmeni, int vek, int cislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.cislo = cislo;
    }
    
    public String getJmeno() {
        return jmeno;
    }
    
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    public String getPrijmeni() {
        return prijmeni;
    }
    
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    
    
    @Override
    public String toString() {
        return (jmeno + "   " + prijmeni + "    " + vek + "    " + cislo);    
    }


}

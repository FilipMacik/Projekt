/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni2;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author filipmacik
 */
public class Databaze {
     
    Scanner scanner = new Scanner(System.in, "Windows-1250");
    
    private ArrayList <Pojistenec> pojistenci;
    private Pojistenec pojistenec;   
    public Databaze() {
        pojistenci = new ArrayList<>();
    }
    
    // PRIDANI POJISTENCE
    public void pridejZaznam() {
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadejte telefonní číslo: ");
        int cislo = Integer.parseInt(scanner.nextLine());
        System.out.println("\nPojištěnec zaevidován");
        System.out.println("Pokračujte ve výběru z menu\n");
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, cislo));
    }
    
    // VYPSANI VSECH POJISTENYCH
    public void vypisZaznamy() {
        for (Pojistenec pojistenec : pojistenci) {
            System.out.println(pojistenec);
            }
        }
    
    //VYHLEDANI POJISTENEHO       
    public ArrayList<Pojistenec> vyhledejZaznamy () {
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = scanner.nextLine();
        ArrayList <Pojistenec> nalezene = new ArrayList<>();
        boolean dleJmena = false;
        boolean dlePrijmeni = false;
        for (Pojistenec pojistenec : pojistenci) {
            if ((dleJmena && pojistenec.getJmeno().equals(jmeno)) || (!dlePrijmeni && pojistenec.getPrijmeni().equals(prijmeni))) {
                nalezene.add(pojistenec);
                System.out.println("\nByl nalezen pojištěnec: ");
                System.out.println(pojistenec);
            }
        }
        return nalezene;
    }    
    
    // VYPIS UVODNI OBRAZOVKU
     public void vypisUvodniObrazovku() {
        System.out.println("------------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("------------------------------");
    }
}

   
    
    

    


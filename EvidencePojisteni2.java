/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.evidencepojisteni2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *
 * @author filipmacik
 */
public class EvidencePojisteni2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in, "Windows-1250");
            
            // zmenit uzivatele podle toho jak se bude jmenovat soubor
            Databaze databaze = new Databaze();
            String volba = "";           
            
            while (!volba.equals("4")) {
            databaze.vypisUvodniObrazovku();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            System.out.println("------------------------------");
            volba = scanner.nextLine();
            
            switch (volba) {
                case "1":
                    databaze.pridejZaznam();
                    break;
                case "2":
                    databaze.vypisZaznamy();
                    break;
                case "3":
                    databaze.vyhledejZaznamy();
                    break;
                case "4":
                    System.out.println("Děkujeme za použití aplikace!");
                    break;
                default:
                    System.out.println("Neplatná volba, stistkněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }
    }
}



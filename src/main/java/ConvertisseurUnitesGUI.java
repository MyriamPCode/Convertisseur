/**
 *
 * @author myria
 */

import javax.swing.*;  // Pour créer l'interface graphique
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Scanner;

public class ConvertisseurUnitesGUI {
    
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in); // Pour lire les entrées
        
        System.out.println("Bienvenue sur le convertisseur d'unités.");
        
        System.out.println("Veuillez sélectionner l'unité de départ (m, km, cm): ");
        String uniteSource = scanner.nextLine();
        
        System.out.println("Veuillex sélectionner l'unité cible (m, km, cm): ");
        String uniteCible = scanner.nextLine();
        
        System.out.println("Entrez la valeur à convertir: ");
        double valeur = scanner.nextDouble();
        
        double resultat=convertir(uniteSource, uniteCible, valeur);
        
        if(resultat != -1) {
            System.out.println(valeur + " " + uniteSource + " = " + resultat + " " + uniteCible);
            } else {
            System.out.println("Unite non valide !");
        }
        
        scanner.close();*/
        
        JFrame fenetre = new JFrame("Convertisseur d'unites");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(400, 300);
        fenetre.setLayout(new FlowLayout());
        
        JLabel labelSource = new JLabel("Unité source (m, km, cm) :");
        JTextField textFieldSource = new JTextField(10);
        
        JLabel labelCible = new JLabel("Unité cible (m, km, cm) :");
        JTextField textFieldCible = new JTextField(10);
        
        JLabel labelValeur = new JLabel("Valeur à convertir :");
        JTextField textFieldValeur = new JTextField(10);
        
        JButton boutonConvertir = new JButton("Convertir");
       
        JLabel labelResultat = new JLabel("Résultat :");
        
        fenetre.add(labelSource);
        fenetre.add(textFieldSource);
        fenetre.add(labelCible);
        fenetre.add(textFieldCible);
        fenetre.add(labelValeur);
        fenetre.add(textFieldValeur);
        fenetre.add(boutonConvertir);
        fenetre.add(labelResultat);
        
        fenetre.setVisible(true);
    }
    
    public static double convertir(String uniteSource, String uniteCible, double valeur){
        double resultat = -1;
        
        //Convertir l'unité source en mètres
        double enMetres = 0;
        switch (uniteSource){
            case "m" :
                enMetres = valeur;
                break;
            case "km": 
                enMetres = valeur * 1000;
                break;
            case "cm" : 
                enMetres = valeur / 100;
                break;
            default:
                System.out.println("Unite source invalide");
                return -1;
        }
        
        // Convertir des mètres vers l'unité cible
        switch(uniteCible) {
            case "m" :
                resultat = enMetres;
                break;
            case "km" : 
                resultat = enMetres / 1000;
                break;
            case "cm" : 
                resultat = enMetres * 100;
                break;
            default : 
                System.out.println("Unite cible invalide !");
                return -1;
        }
        return resultat;
    }
}

/**
 *
 * @author myria
 */

import java.util.Scanner;

public class ConvertisseurUnites {
    
    public static void main(String[] args) {
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
            System.out.println(valeur + "" + uniteSource + "=" + resultat + "" + uniteCible);
            } else {
            System.out.println("Unite non valide !");
        }
        
        scanner.close();
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
        return resultat;
    }
}

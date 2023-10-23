import java.util.Scanner;

public class imenBedoui {

    public static boolean isPalindrome(String str) {
        // Supprimer les espaces et mettre la chaîne en minuscules pour une comparaison sans distinction entre majuscules et minuscules
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Les caractères ne correspondent pas, ce n'est pas un palindrome
            }
            left++;
            right--;
        }

        return true; // Si on arrive ici, la chaîne est un palindrome
    }

    public static void trierTableauCroissant(int[] tableau) {
        int n = tableau.length;
        boolean echange;

        do {
            echange = false;
            for (int i = 0; i < n - 1; i++) {
                if (tableau[i] > tableau[i + 1]) {
                    // Échanger les éléments si ils sont dans le mauvais ordre
                    int temp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = temp;
                    echange = true;
                }
            }
        } 
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int[] tableau = new int[5];


        for (int i=0; i<5 ; i++){
            System.out.println("Donner la valeur de la case numero "+i);
            int x=sc.nextInt();
            tableau[i]=x;
        }

        trierTableauCroissant(tableau);

        System.out.print("Tableau trié en ordre croissant : ");
        for (int num : tableau) {
            System.out.print(num + " ");
        }


        System.out.println("\n Donner votre chaine");
        String str = sc.next();

        if (isPalindrome(str)) {
            System.out.println(str + " est un palindrome.");
        } else {
            System.out.println(str + " n'est pas un palindrome.");
        }

    }
}

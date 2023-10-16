public class SafeHaddar {

    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }

    public static double calculerMoyenne(int[] tableau) {
        if (tableau.length == 0) {
            return 0.0; // Évite la division par zéro
        }

        int somme = calculerSomme(tableau);
        return (double) somme / tableau.length;
    }


}


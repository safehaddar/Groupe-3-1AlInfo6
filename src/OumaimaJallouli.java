public class OumaimaJallouli {
    public static void main(String[] args) {
        int base = 2;
        int exposant = 3;
        int nombre1 = 48;
        int nombre2 = 18;

        // Utilisation des méthodes pour calculer la puissance et le PGCD
        int puissance = calculerPuissance(base, exposant);
        int pgcd = calculerPGCD(nombre1, nombre2);

        System.out.println("La puissance de " + base + " à la puissance " + exposant + " est " + puissance);
        System.out.println("Le PGCD de " + nombre1 + " et " + nombre2 + " est " + pgcd);
    }

    // Méthode pour calculer la puissance d'un nombre
    public static int calculerPuissance(int base, int exposant) {
        if (exposant < 0) {
            throw new IllegalArgumentException("L'exposant doit être positif ou nul.");
        }

        int resultat = 1;
        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }
        return resultat;
    }

    // Méthode pour calculer le PGCD de deux nombres
    public static int calculerPGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

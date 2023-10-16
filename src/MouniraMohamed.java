import java.util.Scanner;

public class MouniraMohamed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vérification si un nombre est premier
        System.out.print("Entrez un nombre : ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " est un nombre premier.");
        } else {
            System.out.println(number + " n'est pas un nombre premier.");
        }

        // Inversion d'une chaîne de caractères
        System.out.print("Entrez une chaîne de caractères : ");
        scanner.nextLine(); // Pour consommer la nouvelle ligne restante
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("La chaîne inversée est : " + reversedString);

        scanner.close();
    }

    // Méthode pour vérifier si un nombre est premier
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Méthode pour inverser une chaîne de caractères
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

public class NaderGuesmi {
    public static boolean estPair(int nombre) {
        return nombre % 2 == 0;
    }
    public static int calculerFactorielle(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculerFactorielle(n - 1);
        }
    }
}
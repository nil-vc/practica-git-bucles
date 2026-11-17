public class App {
    public static void main(String[] args) {
        int mida = 5;
        System.out.println("=== MATRIU DE MULTIPLICACIÓ ===");
        // Bucles aniuats que calculen el producte dels índexs
        for (int i = 0; i < mida; i++) {
            for (int j = 0; j < mida; j++) {
                System.out.printf("%02d ", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
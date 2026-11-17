public class App {
    public static void main(String[] args) {
        int mida = 5;
        System.out.println("=== PATRÓ TRIANGLE ===");
        // Bucle intern adaptat per generar un triangle rectangle
        for (int i = 0; i < mida; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
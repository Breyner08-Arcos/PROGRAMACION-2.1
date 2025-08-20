import java.util.Scanner;

public class InvertirString {
    public static void main(String[] args) {
        String palabra;
        String invert = "";

        System.out.println("Ingrese una palabra:");
        Scanner sc = new Scanner(System.in);
        palabra = sc.nextLine();

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invert += palabra.charAt(i);
        }

        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra invertida: " + invert);
        sc.close();
    }
}
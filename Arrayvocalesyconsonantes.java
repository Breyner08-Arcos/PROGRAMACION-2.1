public class vocalesyconsonantes {

    public static void main(String[] args) {
        // Contar vocales y consonantes en un array con palabras ya determinadas
        String[] palabras = {"leche", "huevos", "panela"};
        int vocales = 0, consonantes = 0;
        String vocalesStr = "aeiou";

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                char c = palabra.charAt(j);
                if (vocalesStr.indexOf(c) != -1) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
}

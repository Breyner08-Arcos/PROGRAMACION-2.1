import java.util.Scanner;

public class vocalesyconsonantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TVocal = 0, TCons = 0, totalconsonantes;
     System.out.println("Ingrese una palabra");
    String palabra = sc.nextLine();
 
    for ( int i = 0; i < palabra.length(); i++ )
    {       TCons++;
    }
 
for ( int i = 0; i < palabra.length(); i++ ) {

    char letra = Character.toLowerCase(palabra.charAt(i));

    if( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
           TVocal++;
    }
}
sc.close();
   totalconsonantes = TCons - TVocal;
   System.out.println("La palabra ingresada es: "+palabra);
   System.out.println("Total de vocales: " + TVocal);
   System.out.println("Total de consonantes: " + totalconsonantes);
    }
}
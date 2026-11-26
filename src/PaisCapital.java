import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> capitales = new HashMap<>();
        capitales.put("España" , "Madrid");
        capitales.put("Rumanía" , "Bucarest");
        capitales.put("Portugal" , "Lisboa");
        capitales.put("Francia" , "París");
        capitales.put("Italia" , "Roma");
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el país del que quieras saber la capital: ");
        String pais = sc.nextLine().trim();
        if (capitales.containsKey(pais)){
            System.out.println("La capital de " + pais + " es " + capitales.get(pais));
        }else System.out.println("La capital de " + pais + " no esta disponible.");

    }
}

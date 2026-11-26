import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teléfonos {
    public static void main(String[] args) {
        Map<String , Integer> agenda = new HashMap<>();
        agenda.put("Andrea" , 628109262);
        agenda.put("Flo" , 614115265);
        agenda.put("Clerem" , 721139415);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el contacto del que quieras saber el teléfono: ");
        String contacto = sc.next();
        System.out.println("El número de " + contacto + " es: " + agenda.get(contacto));
    }
}

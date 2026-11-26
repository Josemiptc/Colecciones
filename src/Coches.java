import java.util.*;

public class Coches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> coches = new ArrayList<>();
        String entrada;
        do {
            System.out.println("Escribe una marca de coche:" );
            entrada = sc.nextLine().trim();
            if (entrada != ""){
                coches.add(entrada);
            }
        }while (entrada != "");
        Collections.sort(coches)    ;
        for (String coche : coches){
            System.out.println(coche);
        }
    }
}

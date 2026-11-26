import java.util.*;

public class TeléfonosII {
    public static void main(String[] args) {
        Map<String , List<Integer>> agenda = new HashMap<>();
        List<Integer> telefonosandrea = new ArrayList<>();
        telefonosandrea.add(619562183);
        telefonosandrea.add(727146143);
        agenda.put("Andrea" , telefonosandrea);
        agenda.put("Flo" , List.of(614115265));
        agenda.put("Clerem" , List.of(721139415));
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el contacto del que quieras saber el teléfono: ");
        String contacto = sc.next();
        System.out.println("El número de " + contacto + " es: " + agenda.get(contacto));
    }
}

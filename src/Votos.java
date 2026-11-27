import java.util.*;

public class Votos {
    public static void main(String[] args) {
        List <String> Alumnos = new ArrayList<>(List.of("Laura", "pablo", " LAURA", "Iván", "Pablo ", "laura", "iván", "Nerea", "pablo", "Laura"));
        Map<String, Integer> votosPorAlumno = new HashMap<>();
        for (String alumno : Alumnos){
            String nombre = alumno.trim().toLowerCase();
            votosPorAlumno.put(nombre , votosPorAlumno.getOrDefault(nombre , 0) + 1);
        }
        String nombre = "";
        int max = 0;
        int votos;
        String clave = "";
        for (Map.Entry<String , Integer> entry : votosPorAlumno.entrySet()){
            votos = entry.getValue();
            if (votos > max){
                max = votos;
                clave = entry.getKey();
            }
        }
        System.out.println("Ha ganado: " + clave);
    }
}

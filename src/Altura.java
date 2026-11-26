import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Altura {
    static List<Double> alturas = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        leerAlturas(numeroAlumnos());
        double media = calcularMedia();
        System.out.println("Media: " + media);
        System.out.println(calcularAlumnosAlturaSuperior(media) + " alumno/s por encima de la media.");
        System.out.println(calcularAlumnosAlturaInferior(media) + " alumno/s por debajo de la media.");
    }public static int numeroAlumnos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número de alumnos: ");
        return sc.nextInt();
    }
    public static void leerAlturas(int numero){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numero ; i++){
            System.out.println("Escribe una altura de un alumno:");
            alturas.add(sc.nextDouble());
        }
    }
    public static double calcularMedia(){
        double suma = 0;
        for (Double altura1 : alturas){
            suma = suma + altura1;
        }
        return suma / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(double media){
        int cont = 0;
        for (Double altura1 : alturas){
            if (altura1 > media){
                cont = cont  + 1;
            }
        }
        return cont;
    }
    public static int calcularAlumnosAlturaInferior(double media){
        int continf = 0;
        for (Double altura1 : alturas){
            if (altura1 < media){
                continf = continf  + 1;
            }
        }
        return continf;
    }
}

import java.util.Scanner;

public class Velas {

    public static void main (String[] args) { 

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantas velas prenderás?");
        int noVelas = scanner.nextInt();
        System.out.println();
        System.out.println("¿Y cuantos residuos?");
        int noResiduos = scanner.nextInt();
        System.out.println();
        
        int primerIteracion = div(noVelas , noResiduos);
        int segundaIteracion = div(primerIteracion, noResiduos);
        int totalVelas = add(noVelas, primerIteracion, segundaIteracion);
        System.out.println("Tendrias un total de " + totalVelas +  " velas");

        scanner.close();

    }

    static int div(int a,  int b) {
        int c = a/b;
        return c;


    }
    static int add(int a, int b, int c){
        int d = a+b+c;
        return d;
    }
}

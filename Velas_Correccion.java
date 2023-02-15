import java.util.Scanner;

public class Velas_Correccion {

    public static void main (String[] args) { 

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantas velas estan completas?");
        int velasInciciales = scanner.nextInt();
        System.out.println();
        System.out.println("¿Con cuantos residuos se puede hacer una nueva?");
        int noResiduos = scanner.nextInt();
        System.out.println();

        int totalVelas = op(velasInciciales, noResiduos);
        System.out.println("Tendrias un total de " + totalVelas +  " velas");

        scanner.close();

    }


    static int op(int velasCompletas, int noResiduos) {

        int primerIteracion = velasCompletas/noResiduos;
        int segundaIteracion = primerIteracion/noResiduos;
        
        int totalVelas = velasCompletas + primerIteracion + segundaIteracion;
        return totalVelas;

    }
}

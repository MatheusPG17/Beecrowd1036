
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] lista;
        String linha;
        double A, B, C, delta, R1, R2;
        
        linha = leia.nextLine();
        lista = linha.split(" ");
        A = Double.parseDouble(lista[0]);
        B = Double.parseDouble(lista[1]);
        C = Double.parseDouble(lista[2]);
        
        delta = (B * B) - (4 * A * C);
        
        if (A == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }else {
            R1 = (-B + Math.sqrt(delta))/2 * A;
            R2 = (-B - Math.sqrt(delta))/2 * A;
            
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
        
    }
}

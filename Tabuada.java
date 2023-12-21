
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        System.out.print("Digite a tabuda que voce deseja ver: ");
        Scanner scan = new Scanner(System.in);
        int tabuada = scan.nextInt();
        
        int limit = 0;
        while(limit <= 10) {
            System.out.println(tabuada + " x " + limit + " = " + tabuada * limit);
            limit++;
        }
        }
    }

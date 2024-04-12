//4) Faça um Programa que converta metros para centímetros
import java.util.Scanner;

public class Tarefa_4 {

    static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("[Me diga quantos metros você desejar converter]");
        double metro = input.nextDouble();

        double cent = metro * 100;

        System.out.print("O valor "+ metro + " de metros foi convertido em " + cent + " Centímetros" );
    }
}
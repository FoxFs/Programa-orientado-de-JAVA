//6) Faça um Programa que calcule a área de um quadrado.
import java.util.Scanner;

public class Tarefa_6 {
    static Scanner altura = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Digite a altura do Quadrado: ");
        double L = altura.nextDouble();

        double R = L * 4;

        System.out.printf("A area do Quadrado foi definida em [ %.1fcm (Ao quadrado) ] aproximadamente", R);
    }
}

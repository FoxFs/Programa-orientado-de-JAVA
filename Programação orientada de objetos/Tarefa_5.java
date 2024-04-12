//5) Faça um Programa que indique o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;

public class Tarefa_5 {
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Digite o raio do circulo: ");
        double raio = input.nextDouble();
        double PI = 3.14f;
        double quadrado = raio * raio;
        double P = PI * quadrado;

        System.out.printf("O raio do circulo é: %.1fcm (ao quadrado) aproxidamente", P);
    }
}

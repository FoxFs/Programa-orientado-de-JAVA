//9) Faça um Programa que indique 2 números inteiros e um número real. Calcule e mostre:.
import java.util.Scanner;

public class Tarefa_9 {
    //Variaveis Scannn
    static Scanner num1 = new Scanner(System.in);
    static Scanner num2 = new Scanner(System.in);
    static Scanner real = new Scanner(System.in);
    public static void main(String[] args){
        //variavéis
        System.out.print("Digite  primeiro numero inteiro: ");
        int primeiroNumero = num1.nextInt();
        System.out.print("Digite o segundo numero inteiro: ");
        int segundoNumero = num2.nextInt();
        System.out.print("Digite um numero Real: ");
        double numeroReal = real.nextDouble();
        double resultadoA = ( 2 * primeiroNumero) * (segundoNumero / 0.2);

        //a) o produto do dobro do primeiro com metade do segundo 
        System.out.println("[QUESTÃO A]");
        System.out.println(resultadoA);

        //b) a soma do triplo do primeiro com o terceiro.
        double resultadoB = (3 * primeiroNumero) + numeroReal;
        System.out.println("[QUESTÃO B]");
        System.out.println(resultadoB);

        //c )o terceiro elevado ao cubo.
        double resultadoC = Math.pow(numeroReal, 3);
        System.out.println("[QUESTÃO C]");
        System.out.println(resultadoC);
    }
}

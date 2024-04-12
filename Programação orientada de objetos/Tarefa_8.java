/*8) Faça um Programa que indique a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9)*/
import java.util.Scanner;

public class Tarefa_8 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double Fahrenheit = entrada.nextDouble();
        double Celsius = (Fahrenheit - 30)/2;

        System.out.print(+ Fahrenheit + "F é convertido em " + Celsius + "C");
    } 
}

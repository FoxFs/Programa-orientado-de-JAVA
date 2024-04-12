/*7) Faça um Programa que indique quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês.*/
import java.util.Scanner;

public class Tarefa_7 {
    static Scanner num = new Scanner(System.in);
    static Scanner num1 = new Scanner(System.in);
    static Scanner daywork = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Indique o valor do salario a hora: ");
        float Hora = num.nextFloat();

        System.out.print("Indique as horas trabalhadas: ");
        int HoraT = num1.nextInt();

        System.out.print("Por quantos dias Trabalhados?: ");
        int dias = daywork.nextInt();

        double R = Hora * HoraT;
        double salario = R * dias;

        System.out.printf("O total do seu salario no final do mês é: R$%.2f Reais ", salario);

    }
}

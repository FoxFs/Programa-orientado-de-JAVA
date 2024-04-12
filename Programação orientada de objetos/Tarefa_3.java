//3) Faça um Programa que indique as 4 notas bimestrais e mostre a média.
import java.util.Scanner;

public class Tarefa_3 {
    
    static Scanner scanner1 = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    static Scanner scanner3 = new Scanner(System.in);
    static Scanner scanner4 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o numero: ");
        double num1 = scanner1.nextDouble();
        
        System.out.print("Digite o numero: ");
        double num2 = scanner2.nextDouble();
        
        System.out.print("Digite o numero: ");
        double num3 = scanner3.nextDouble();
        
        System.out.print("Digite o numero: ");
        double num4 = scanner4.nextDouble();
        
        double media = (num1 + num2 + num3 + num4) / 4;
        
        System.out.printf("As notas bimestrais foram definidas em: %.1f, %.1f, %.1f, %.1f. A media de todas deu: %.1f", num1, num2, num3, num4, media);
    }
}

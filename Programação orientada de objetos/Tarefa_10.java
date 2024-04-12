/*10) Tendo como dados de entrada a altura de uma pessoa,
 construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 */
import java.util.Scanner;

public class Tarefa_10 {
    static Scanner altura = new Scanner(System.in); 
    public static void main(String[] args){
        System.out.print("Digite a altura da pessoa: ");
        double alt = altura.nextDouble();

        double peso_ideal = (72.7 * alt) - 58;

        System.out.printf("O peso ideal é %.1fKg", peso_ideal);
    }    
}
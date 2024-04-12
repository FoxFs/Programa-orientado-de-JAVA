//2)Faça um Programa que informe um número e então mostre a mensagem O número informado foi [número].
import java.util.*;

public class Tarefa_2 {

    static Scanner entrada = new Scanner(System.in);
    public static void main (String[] args){

        System.out.print("Digite o numero desejado: ");
        int num = entrada.nextInt();

        System.out.println("Aqui está o numero digitado: " + num);

    }



}
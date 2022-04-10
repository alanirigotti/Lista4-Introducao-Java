import java.util.Scanner;
public class Uni4Exe05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Dada uma pergunta, “a cor é azul?”, 
        //faça um programa que leia uma variável lógica com a resposta e responda “Sim”,
        // caso a resposta seja true, ou “Não”, caso seja false.

        System.out.println("A cor é azul?");
        boolean cor = leitor.nextBoolean();

        if (cor == true) {
            System.out.println("Sim");

        } else {
            System.out.println("Não");

        } 

        leitor.close();
        
    }
}
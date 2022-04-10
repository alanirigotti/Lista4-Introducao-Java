import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

//Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.

        System.out.println("Insira um valor inteiro maior que 0");
        double valor = leitor.nextInt();

        if (valor % 2 == 0) {
            System.out.println("É par");
        
        } else {

            System.out.println("É impar");

        }

        leitor.close();
        
    }


}
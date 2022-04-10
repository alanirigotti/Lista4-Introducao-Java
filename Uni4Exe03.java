import java.util.Scanner;
public class Uni4Exe03 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.

        //System.out.println("Insira um valor para A");
        int A = leitor.nextInt();

        //System.out.println("Insira um valor para B");
        int B  = leitor.nextInt();

        if (A >= B) {
            System.out.println("O valor da letra A é maior que a B");
        }

        if (B >= A) {
            System.out.println("O valor da letra B maior que A");
        
        }

        leitor.close();



        
    }
}

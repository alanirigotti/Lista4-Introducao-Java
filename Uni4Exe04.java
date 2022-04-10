import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.

        float valor = leitor.nextFloat();

        if (valor == 0) {
            System.out.println("O valor não possui casas decimais");
            
        } else { 
            System.out.println("O valor possui casa decimal");

        }

        leitor.close();
    }

}


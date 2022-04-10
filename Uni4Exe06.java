import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M'
        // escreva “Masculino”.
        // Se for digitada a letra 'F' escreva “Feminino”. Se for informado 'I' escreva
        // “Não Informado”.
        // Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de
        // testar a letra, converta-a para maiúscula.

        System.out.println("Digite um caractere");
        char caractere = leitor.next().charAt(0);
        boolean entrou = false;

        if ('F' == caractere) {
            System.out.println("Feminino");
            entrou = true;

        }

        if ('M' == caractere) {
            System.out.println("Masculino");
            entrou = true;

        }

        // é false se não entrou no masculino e feminino
        if (entrou == false) {
            System.out.println("Não informado");

        } else { 
            System.out.println("Entrada Incorreta");

        }

        leitor.close();

    }

}

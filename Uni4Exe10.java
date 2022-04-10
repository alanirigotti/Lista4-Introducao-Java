import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um
        // algoritmo para ler as idades dos filhos e
        // exibir quem é o caçula da família; suponha que não haja empates.

        System.out.println("Insira a idade dos filhos");
        int marcos = leitor.nextInt();
        int ze = leitor.nextInt();
        int lulu = leitor.nextInt();

        // Aqui, comparamos todos com todos;
        if (marcos < ze && marcos < lulu) {
            System.out.println("Marquinhos é o caçula");

        } else if (ze < marcos && ze < lulu) {
            System.out.println("Zézinho é o caçula");
            // else if fica dentro do if, caso o marcos não for caçula, pula pro Zé;

        } else if (lulu < marcos && lulu < ze) {
            System.out.println("Luluzinha é a caçula");

        }

        leitor.close();

    }

}

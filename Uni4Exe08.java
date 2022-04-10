import java.util.Scanner;
public class Uni4Exe08 {

// Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
//Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char letra = leitor.next().charAt(0);

        if (letra == 'a') {
            System.out.println("É uma vogal");

        } else if  (letra == 'e') {
            System.out.println("É uma vogal");

        } else if (letra == 'i') {
            System.out.println("É uma vogal");

        } else if (letra == 'o') {
            System.out.println("É uma vogal");
        
        } else if (letra == 'u') {
            System.out.println("É uma vogal");
        }

        else {
            System.out.println("Não é uma vogal"); //Usa o else if quando é o mesmo tópico
        }

        leitor.close();
    
}


}

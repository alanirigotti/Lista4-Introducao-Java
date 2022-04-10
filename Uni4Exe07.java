import java.util.Scanner;

public class Uni4Exe07 {

    // O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com
    // peso superior pagam um adicional de R$ 0,45
    // por cada 20 gramas, ou fração, em que excedem aquele peso. Escreva um
    // algoritmo que dado o peso da carta, em gramas,
    // determine o custo do selo. Para resolver este problema pode se utilizar do
    // algoritmo descrito no fluxograma:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // System.out.println("Entre com o peso da carta");
        double grama = leitor.nextDouble();
        double valorAPagar = 0;
        double pesoExcedido = grama - 50;

        // Se a gramatura for igual ou menor 50, não haverá adicional
        if (grama <= 50) {
            System.out.println("O valor a pagar é: " + valorAPagar);
            valorAPagar = 0.45;

        //Caso for maior que 50g, o programa irá fazer a conta do peso excedido 
        } else {
            double valorFinal = 0.45f + (0.0225 * pesoExcedido);
            System.out.println(String.format("O custo do selo é: %.2f", valorFinal)); //Saída da conta do selo

        }

        leitor.close();

    }

}

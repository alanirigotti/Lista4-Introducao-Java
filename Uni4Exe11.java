import java.util.Scanner;

 public class Uni4Exe11 {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            //Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, 
            //APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais,
            // e apenas irmãos se todas as idades forem diferentes.

            System.out.println("Insira a data de nascimento dos 3 irmãos");
            int irmão1 = leitor.nextInt();
            int irmão2 = leitor.nextInt();
            int irmão3 = leitor.nextInt();
          

//comparar o nascimento do irmão1 com o 2 e ver se são gemêos

            if (irmão1 == irmão2 && irmão1 == irmão3 && irmão3 == irmão2) {
                System.out.println("São trigêmeos");
            
            } else if (irmão1 == irmão3) {
                System.out.println("irmão1 e irmão2 são gêmeos");

            } else if (irmão2 == irmão3) {
                System.out.println("irmão2 e irmão3 são gêmeos");
 
            } else if (irmão1 > irmão2 && irmão2 > irmão3 && irmão1 > irmão3) {
                System.out.println("São apenas irmãos");
            }

            leitor.close();






            
        }
    
}

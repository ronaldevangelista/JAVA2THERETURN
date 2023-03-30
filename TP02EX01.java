import java.util.Scanner;
public class TP02EX01 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        float x = ler.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float z = ler.nextFloat();

        while(x >= z) {
            System.out.println("O valor inserido é inválido");
            System.out.print("Por favor, digite outro valor: ");
            z = ler.nextFloat();
        }

        System.out.println(z + " é maior do que " + x);
    }
}
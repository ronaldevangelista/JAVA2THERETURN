import java.util.Scanner;
public class TP02EX02 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double[] valores = new Double[10];
        double maior = 0;
        double soma = 0;

        for (int i = 0; i <= 9; i++){
            System.out.println("Insira o " + (i + 1) + "º valor:");
            valores[i] = ler.nextDouble();

            while(valores[i] < 0){
                System.out.println("O valor tem que ser positivo");
                System.out.print("Insira um novo valor: ");
                valores[i] = ler.nextDouble();
            }

            if (maior < valores[i]) {
                maior = valores[i];
            }

            soma = soma + valores[i];

        }

        double media = soma / 10;

        System.out.println("O maior valor é de: " + maior);
        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("A média dos valores é de: " + media);
    }
}
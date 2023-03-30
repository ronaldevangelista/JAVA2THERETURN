import java.util.Scanner;

public class TP02EX03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double[] valores = new Double[19];
        double maior = 0;
        double menor = 0;
        int negativos = 0;
        double n = 0;
        double soma = 0;
        String teste = "N";
        boolean key = false;

        do {
            System.out.print("Insira a quantidade de números desejada: ");
                n = ler.nextDouble();

            while(n < 0){
                System.out.println("O valor tem que ser positivo");
                System.out.print("Insira um novo valor: ");
                n = ler.nextDouble();
            }

            for (int i = 0; i <= (n - 1); i++){
                System.out.println("Insira o " + (i + 1) + "º valor:");
                valores[i] = ler.nextDouble();


                if (maior < valores[i]) {
                    maior = valores[i];
                }

                if (menor > valores[i]){
                    menor = valores[i];
                }

                if (valores[i] < 0){
                    negativos++;
                }

                soma = soma + valores[i];

            }

            double media = soma / n;

            System.out.println("O maior valor é de: " + maior);
            System.out.println("O menor valor é de: " + menor);
            System.out.println("A soma dos valores é de: " + soma);
            System.out.println("A média dos valores é de: " + media);
            System.out.println("A porcentagem de valores positivos é de: " + ((n - negativos) * 100/n) + "%");
            System.out.println("A porcentagem de valores negativos é de: " + (negativos * (100 / n)) + "%");

            System.out.print("Você deseja continuar? Insira S ou N: ");
            teste = ler.next();
            System.out.println(teste);

            if (teste == "S") {
                key = true;
            }


        } while (key == true) ;

        System.out.println("Código encerrado com sucesso.");
    }
}

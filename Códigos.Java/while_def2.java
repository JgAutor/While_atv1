import java.util.Scanner;

public class while_def2 {
    public static void main(String[] args) {
        
        System.out.println("Informe 10 valores para a verificação simples do programa:");
        Scanner scanner = new Scanner(System.in);

        int contagem = 0;
        int num1M = Integer.MIN_VALUE;
        int num2M = Integer.MIN_VALUE;

        while (contagem < 10) {
            System.out.println("Insira o "+(contagem+1)+"° número a ser acrescentado");
            int valor = scanner.nextInt();

            if (valor > num1M) {
                num2M = num1M;
                num1M = valor;
            } else if (valor > num2M) {
                num2M = valor;
            }

            contagem++;
        }

        System.out.println("Os maiores números digitados pelo usuário são: "+num1M+" e "+num2M);

        scanner.close();
    }
}
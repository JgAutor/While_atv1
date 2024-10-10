import java.util.Scanner;

public class while_def1 {
    public static void main(String[] args) throws Exception {

        System.out.println("Favor, informe o total de estudantes.");
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados.
        int numEst = scanner.nextInt();
        double ntotal = 0.0;
        int contagem = 0;

        while (contagem < numEst) {
            System.out.println("Insira a nota do aluno "+(contagem+1)+": ");
            double ntAlunos = scanner.nextDouble();
            ntotal += ntAlunos;
            contagem++;
        }        

        double ntMedia = ntotal / numEst;
        System.out.println("A média da sala e dê: "+ntMedia);

        scanner.close();
    }   
}
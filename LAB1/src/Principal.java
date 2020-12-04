import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        System.out.println("Digite o DRE dos alunos e suas médias na disciplina. "+
                "Digite uma nota negativa para encerrar o programa.");

        long DRE = 0;
        long DREmn = 0;
        float media = 0;
        int notas = -1;
        float mediaTurma = 0;
        float maiorMedia = 0;

        Scanner scanner = new Scanner(System.in);

        while(media >= 0){
            DRE = scanner.nextLong();
            media = scanner.nextFloat();
            notas += 1;

            if(media >= 0){
                mediaTurma += media;
            }

            float x = media;
            long y = DRE;
            if(x > maiorMedia){
                maiorMedia = x;
                DREmn = y;
            }
        }

        System.out.printf("%d notas digitadas\nMédia da turma: %f\nDRE com maior média:%d", notas, mediaTurma/notas, DREmn);
    }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] notas = new double[4];
    //coletando as notas dos 4 bimestres
    for(int i = 0; i < 4; i++) {
      System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
      notas[i] = scanner.nextDouble();
    }
    //calculando a média e convertendo para escala A-F
    GradeCalculator gradeCalculator = new GradeCalculator(notas);
    String[] grades = gradeCalculator.getGrades();
    double mediaFinal = gradeCalculator.calculateAverange();
    //verificando aprovação
    ApprovalChecker approvalChecker = new ApprovalChecker(mediaFinal);
    String status = approvalChecker.getApprovalStatus();
    //exibindo os resultados
    System.out.println("Notas convertidas: " + String.join(", ", grades));
    System.out.println("Média final: " + mediaFinal);
    System.out.println("Status: " + status);

    scanner.close();
  }
}
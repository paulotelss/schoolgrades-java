public class GradeCalculator {
  private double[] notas;

  public GradeCalculator(double[] notas) {
    this.notas = notas;
  }
  public String[] getGrades() {
    String[] grades = new String[notas.length];

    for (int i = 0; i < notas.length; i++) {
      grades[i] = convertToGrade(notas[i]);
    }

    return grades;
  }

  public double calculateAverange() {
    double soma = 0;
    for (double nota : notas) {
      soma += nota;
    }
    return soma / notas.length;
  }
  private String convertToGrade(double nota) {
    if (nota >= 9.0) return "A";
    if (nota >= 8.0) return "B";
    if (nota >= 7.0) return "C";
    if (nota >= 5.0) return "D";
    return "F";
  }
}
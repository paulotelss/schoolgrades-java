public class ApprovalChecker {
  private double media;
  public ApprovalChecker(double media) {
    this.media = media;
  }
  public String getApprovalStatus() {
    if (media >= 7.0) {
      return "Aprovado";
    } else {
      return "Reprovado";
    }
  }
}
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    String calculusName = "Cálculo";
    String physicsName = "Física";

    Subject calculus = new Subject(calculusName, 131, 9000, 40000);

    Subject physics = new Subject(physicsName, 97, 9000, 19000);
    
    calculus.showDetails();
    physics.showDetails();

    try (Scanner subjectInput = new Scanner(System.in)) {
      System.out.println("Deseja ver mais conteúdos de Cálculo ou de Física?");
      String chosenSubject = subjectInput.nextLine();

      if (!chosenSubject.equals(physicsName) && !chosenSubject.equals(calculusName)) {
        System.out.println("\nMatéria inválida");
        return;
      }
      if(chosenSubject.equals(physicsName)) {
        physics.showTopics(chosenSubject);
      }
      if(chosenSubject.equals(calculusName)) {
        calculus.showTopics(chosenSubject);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

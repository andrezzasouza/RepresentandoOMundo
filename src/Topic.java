import java.util.Scanner;

public class Topic {
  private String name;
  private String description;

  Topic(String name, String description) {
    this.name = name;
    this.description = description;
  }

  
  private void chooseAction() {
    try (Scanner actionInput = new Scanner(System.in)) {
      System.out.println("Como você deseja estudar " + this.name + "? Escolha o número da ação:");
      System.out.println("1) Ver aulão");
      System.out.println("2) Fazer exercícios de fixação");
      System.out.println("3) Fazer exercícios de livro");
      String chosenAction = actionInput.nextLine();
      if (!chosenAction.equals("1") && !chosenAction.equals("2") && !chosenAction.equals("3")) {
        System.out.println("\nAção inválida!");
        return;
      }
      if (chosenAction.equals("1")) {
        watchMasterclasses();
      }
      if (chosenAction.equals("2")) {
        solveExercise();
      }
      if (chosenAction.equals("3")) {
        solveBookExercise();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private void watchMasterclasses () {
    System.out.println("\nAssistindo aulão de " + name + "!");
  }
  
  private void solveExercise () {
    System.out.println("\nFazendo exercício de " + name + " para fixar a matéria!");
  }
  
  private void solveBookExercise () {
    System.out.println("\nFazendo exercício de livro de " + name + "!");
  }

  void showDetails() {
    System.out.println("\n" + this.name + ":");
    System.out.println(this.description + "\n");
    chooseAction();
  }
  
  String getName () {
    return this.name;
  }
  String getDescription () {
    return this.description;
  }
}

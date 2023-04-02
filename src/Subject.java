import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subject {
  private String name;
  private int numberOfMasterclasses;
  private int numberOfSolvedExercises;
  private int numberOfSolvedBookExercises;
  private List<Topic> topic = new ArrayList<Topic>();

  Subject(String name, int numberOfMasterclasses, int numberOfSolvedExercises, int numberOfSolvedBookExercises) {
    if (name.equals("Cálculo") || name.equals("Física")) {
      this.name = name;
    } else {
      System.out.println("Nome inválido!");
      return;
    }
    this.numberOfMasterclasses = numberOfMasterclasses;
    this.numberOfSolvedExercises = numberOfSolvedExercises;
    this.numberOfSolvedBookExercises = numberOfSolvedBookExercises;
  }

  void showDetails() {
    System.out.println(this.name + ":");
    System.out.println(this.numberOfMasterclasses + " aulões gravados");
    System.out.println(this.numberOfSolvedExercises + " exercícios de fixação resolvidos");
    System.out.println(this.numberOfSolvedBookExercises + " exercícios de livros resolvidos\n");
  }

  private void createTopics() {
    if (this.name.equals("Cálculo")) {
      Topic calculusTopic1 = new Topic("Derivadas", "A derivada é a taxa de variação de uma função!");
      Topic calculusTopic2 = new Topic("Integrais", "A integral basicamente representa o valor de uma área.");

      this.topic.add(calculusTopic1);
      this.topic.add(calculusTopic2);
    }
    if (this.name.equals("Física")) {
      Topic physicsTopic1 = new Topic("Leis de Newton",
          "As três Leis de Newton são capazes de descrever o movimento dos objetos.");

      Topic physicsTopic2 = new Topic("Grandezas Físicas",
          "Definimos como grandezas físicas os valores que utilizamos para medir e quantificar os fenômenos que estudamos na Física.");

      this.topic.add(physicsTopic1);
      this.topic.add(physicsTopic2);
    }
  }

  void showTopics(String subject) {
    createTopics();
    System.out.println("\nTópicos de " + subject + ":");
    for (int i = 0; i < this.topic.size(); i++) {
      System.out.println(this.topic.get(i).getName());
    }
    chooseTopic();
  }

  void chooseTopic() {
    try (Scanner topicInput = new Scanner(System.in)) {
      String topicOne = this.topic.get(0).getName();
      String topicTwo = this.topic.get(1).getName();

      System.out.println("\nVocê deseja ver o tópico " + topicOne + " ou o tópico " + topicTwo + "?");
      String chosenTopic = topicInput.nextLine();

      if (!chosenTopic.equals(topicOne) && !chosenTopic.equals(topicTwo)) {
        System.out.println("\nTópico inválido!");
        return;
      }
      if (chosenTopic.equals(topicOne)) {
        this.topic.get(0).showDetails();
      }
      if (chosenTopic.equals(topicTwo)) {
        this.topic.get(1).showDetails();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

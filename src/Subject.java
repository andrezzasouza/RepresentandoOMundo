import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subject {
  String name;
  int numberOfMasterclasses;
  int numberOfSolvedExercises;
  int numberOfSolvedBookExercises;
  List<Topic> topic = new ArrayList<Topic>();

  void showDetails() {
    System.out.println(this.name + ":");
    System.out.println(this.numberOfMasterclasses + " aulões gravados");
    System.out.println(this.numberOfSolvedExercises + " exercícios de fixação resolvidos");
    System.out.println(this.numberOfSolvedBookExercises + " exercícios de livros resolvidos");
  }
  void showTopics(String subject) {
    System.out.println("\nTópicos de " + subject + ":");
    for (int i = 0; i < this.topic.size(); i++) {
      System.out.println(this.topic.get(i).name);
    }
  }
    void chooseTopic(String topic) {
    try (Scanner topicInput = new Scanner(System.in)) {
      System.out.println("\n");
      String chosenSubject = topicInput.nextLine();

      // TODO Continue to write function
    }
  }
}

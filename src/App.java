import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Subject calculus = new Subject();
        calculus.name = "Cálculo";
        calculus.numberOfMasterclasses = 131;
        calculus.numberOfSolvedExercises = 9000;
        calculus.numberOfSolvedBookExercises = 40000;

        Topic calculusTopic1 = new Topic();
        calculusTopic1.name = "Derivadas";
        calculusTopic1.description = "A derivada é a taxa de variação de uma função!";

        Topic calculusTopic2 = new Topic();
        calculusTopic2.name = "Integrais";
        calculusTopic2.description = "Eu sei que o nome é diferente, mas a integral basicamente representa o valor de uma área.";

        calculus.topic.add(calculusTopic1);
        calculus.topic.add(calculusTopic2);


        Subject physics = new Subject();
        physics.name = "Física";
        physics.numberOfMasterclasses = 97;
        physics.numberOfSolvedExercises = 9000;
        physics.numberOfSolvedBookExercises = 19000;

        Topic physicsTopic1 = new Topic();
        physicsTopic1.name = "Leis de Newton";
        physicsTopic1.description = "As três Leis de Newton são capazes de descrever o movimento dos objetos.";

        Topic physicsTopic2 = new Topic();
        physicsTopic2.name = "Grandezas Físicas";
        physicsTopic2.description = "Definimos como grandezas físicas os valores que utilizamos para medir e quantificar os fenômenos que estudamos na Física.";

        physics.topic.add(physicsTopic1);
        physics.topic.add(physicsTopic2);

        calculus.showDetails();
        physics.showDetails();

        try (Scanner subjectInput = new Scanner(System.in)) {
            System.out.println("\nDeseja ver mais conteúdos de Cálculo ou de Física?");
            String chosenSubject = subjectInput.nextLine();

            if(chosenSubject.equals("Física")) {
                physics.showTopics(chosenSubject);
            }
            if(chosenSubject.equals("Cálculo")) {
                calculus.showTopics(chosenSubject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Session session = new Session(); // create an instance of Session

        Random random = new Random();

        // randomly divide into full-time and part-time
        for (int i = 0; i < 20; i++) {
            if (random.nextBoolean()) {
                FullTime student = new FullTime("Student" + (i + 1));

                double[] examScores = {random.nextInt(101), random.nextInt(101)}; //generate random scores
                student.setExamScore(0, examScores[0]);
                student.setExamScore(1, examScores[1]);

                for (int j = 0; j < 15; j++) {
                    student.setQuizScore(j, random.nextInt(101));
                }
                session.addStudent(student, i); // add student instances into session
            } else {
                PartTime student = new PartTime("Student" + (i + 1));
                for (int j = 0; j < 15; j++) {
                    student.setQuizScore(j, random.nextInt(101));
                }
                session.addStudent(student, i);
            }
        }

        // call all public methods of Session
        session.calculateAverageQuizScores();
        session.printQuizScoresAscending();
        session.printPartTimeStudentNames();
        session.printFullTimeStudentExamScores();
    }
}
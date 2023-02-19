import java.util.Arrays;

class Session {
    private Student[] students; // array

    public Session() {
        this.students = new Student[20]; // hold 20 students in a session
    }

    // add students into array
    public void addStudent(Student student, int index) {
        students[index] = student;
    }

    // public methods to calculate average quiz scores per student for the whole class
    public void calculateAverageQuizScores() {
        System.out.println("Average quiz scores per student:");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            double[] quizScores = student.getQuizScores(); // get 15 quiz scores into array

            // calculate average of quiz scores array
            double sum = 0;
            for (int j = 0; j < quizScores.length; j++) {
                sum += quizScores[j];
            }
            double avg = sum / quizScores.length;

            // print the result rounded to two decimal places
            System.out.println(student.getName() + ": " + String.format("%.2f", avg));
        }
    }

    public void printQuizScoresAscending() {
        System.out.println("The list of quiz scores in ascending order:");
        // create an array of all scores and initialize it
        double[] allScores = new double[students.length * 15]; // create a array of all scores and initialize it
        int n = 0;

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            double[] quizScores = student.getQuizScores();

            // put all the scores into allScore array
            for (int j = 0; j < quizScores.length; j++) {
                allScores[n] = quizScores[j];
                n++;
            }
        }
        Arrays.sort(allScores); // ascending sort
        System.out.println(Arrays.toString(allScores));
    }

    public void printPartTimeStudentNames() {
        System.out.println("Part-time students' names:");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];

            if (student instanceof PartTime) {
                System.out.println(student.getName());
            }
        }
    }

    public void printFullTimeStudentExamScores() {
        System.out.println("Full-time students and their exam scores:");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];

            if (student instanceof FullTime) {
                FullTime fullTime = (FullTime) student;
                double[] examScores = fullTime.getExamScores();
                System.out.println(fullTime.getName() + ": " + Arrays.toString(examScores));
            }
        }
    }
}
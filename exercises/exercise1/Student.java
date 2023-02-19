// create base class Student
class Student {
    private String name;
    private double[] quizScores; // use array to hold 15 quiz scores

    public Student(String name) {
        this.name = name;
        this.quizScores = new double[15];
    }

    public String getName() {
        return name;
    }

    // get method to access the 15 quiz scores list for students
    public double[] getQuizScores() {
        return quizScores;
    }

    // set method to set quiz score value for each time
    public void setQuizScore(int index, double score) {
        quizScores[index] = score;
    }
}

// derived class FullTime and PartTime
class FullTime extends Student {
    private double[] examScores;

    public FullTime(String name) {
        super(name);
        this.examScores = new double[2]; // array to hold 2 exam scores
    }

    public double[] getExamScores() {
        return examScores;
    }

    // set method to set exam score value for each time
    public void setExamScore(int index, double score) {
        examScores[index] = score;
    }
}

class PartTime extends Student {
    public PartTime(String name) {
        super(name);
    }
}

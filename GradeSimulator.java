package ENIOLA_QUESTION.src.saintcoded;

import java.util.ArrayList;
import java.util.Collections;

public class GradeSimulator {
    double sumQuizAndAssignmentGotten;
    double sumQuizAndAssignmentMax;
    ArrayList<Double> sumExam;
    ArrayList<Double> sumExamMax;

    public GradeSimulator() {
        sumQuizAndAssignmentGotten = 0;
        sumQuizAndAssignmentMax = 0;
        sumExam = new ArrayList<>();
        sumExamMax = new ArrayList<>();
    }

    public void addQuizOrAssignment(double myGrade, double maxGrade) {
        sumQuizAndAssignmentGotten += myGrade;
        sumQuizAndAssignmentMax += maxGrade;

    }
    public void addExam(double myGrade, double maxGrade) {
        sumExam.add(myGrade);
        sumExamMax.add(maxGrade);
    }

    public double getFinalGrade() {
        double QA = sumQuizAndAssignmentGotten / sumQuizAndAssignmentMax;
        if (QA == 0) QA = 1;
        double E;
        Collections.sort(sumExam, Collections.reverseOrder());
        double Highests = 0;
        double MaxHighests = 0;
        int count = 0;
        for (Double score : sumExam) {
            if (count >= 3) break;
            Highests += score;
            MaxHighests += sumExamMax.get(sumExam.indexOf(score));
            count++;
        }
        if (MaxHighests != 0) {
            E = Highests / MaxHighests;
        } else {
            E = 1;
        }
//        System.out.println(MaxHighests);
//        System.out.println(Highests);
//        System.out.println(E);

        double FG = 50 * QA + 50 * E;
        return FG;
    }

    public static void main(String[] args) {
        GradeSimulator grader = new GradeSimulator();

        grader.addQuizOrAssignment(1,1);
        grader.addQuizOrAssignment(1,1);
        grader.addQuizOrAssignment(1,1);
        grader.addQuizOrAssignment(1,1);
        grader.addQuizOrAssignment(1,1);

        grader.addQuizOrAssignment(1,1);
        grader.addQuizOrAssignment(1,1);
        grader.addQuizOrAssignment(1,1);

        grader.addExam(40,40);
        grader.addExam(40,40);
        grader.addExam(0,40);

        System.out.println("My grade before the final: " + grader.getFinalGrade());

        grader.addExam(40,40);

        System.out.println("My grade after the final: " + grader.getFinalGrade());

    }
}

package ENIOLA_QUESTION.src.saintcoded;

import java.util.ArrayList;
import java.util.List;

public class GradeSystem {
    double quizsum=0;
    double maxquizsum=0;
    List <Double> exam = new ArrayList<>();
    List <Double> maxexam = new ArrayList<>();
    double examsum=0;
    double maxexamsum=0;

    GradeSystem(){

    }
    public void  addQuizORAssignments(double mygrade,double maxgrade){
        if (mygrade<0||maxgrade<0){
            return;
        }
        quizsum+=mygrade;
        maxquizsum+=maxgrade;
    }
    public void addexam(double mygrade,double maxgrade){
        if (mygrade<0||maxgrade<0){
            return;
        }
        exam.add(mygrade);
        maxexam.add(maxgrade);


    }
    public double getfinalgrade(){
        examsum=0;
        maxexamsum=0;
        if(maxexam.size()==4){
            for (int i = 0; i < maxexam.size()-1; i++) {
                maxexamsum+=maxexam.get(i);}
        }
        else{
            for (int i = 0; i < maxexam.size(); i++) {
                maxexamsum+=maxexam.get(i);
        }
        }
//        System.out.println(maxexamsum+" hg");
        double n;
        double newn=0;

        for (int i = 0; i < exam.size(); i++) {
            n=exam.get(i);
            for (int j= 0; j < exam.size(); j++) {
                if(exam.get(j)<n){
                    newn=exam.get(j);
                }
            }
            if(newn==n){
                break;
            }
        }


        for (int i = 0; i < exam.size(); i++) {
            examsum+=exam.get(i);
//            System.out.println(examsum);
        }
        examsum-=newn;

        double qa=quizsum/maxquizsum;
        if (!(qa>0)){
            qa=1;
        }
        double e=examsum/maxexamsum;
        if (!(e>0)){
            e=1;
        }
//        System.out.println(e);
        double fg;
        fg=50*qa+50*e;
        return fg;
    }

    public static void main(String[] args) {
        GradeSystem grader=new GradeSystem();

        grader.addQuizORAssignments(1,1);
        grader.addQuizORAssignments(1,1);
        grader.addQuizORAssignments(1,1);
        grader.addQuizORAssignments(1,1);
        grader.addQuizORAssignments(1,1);

        grader.addQuizORAssignments(5,5);
        grader.addQuizORAssignments(5,5);
        grader.addQuizORAssignments(5,5);

        grader.addexam(40,40);
        grader.addexam(40,40);
        grader.addexam(0,40);



        System.out.println("My grade before the final: "+ grader.getfinalgrade());
        grader.addexam(40,40);
        System.out.println("My grade after the final: "+ grader.getfinalgrade());
    }
}

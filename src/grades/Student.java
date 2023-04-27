package grades;

import java.util.ArrayList;

public class Student {



    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name=name;
        this.grades =new ArrayList<>();

    }

    public String getName(){
        return name;
    }

    public void addGrades(int grade){
        grades.add(grade);
    }
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public double getGradeAverage(){
        double sum = 0;
        if(!grades.isEmpty()) {
            for (Integer grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
        return sum;
    }

    }


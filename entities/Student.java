package entities;

public class Student {
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String AprovedOrReproved(){
        if(finalGrade() < 60){
            return "Reprovado";
        }
        else{
            return"Aprovado";
        }
    }
}
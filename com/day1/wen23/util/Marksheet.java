import java.util.Scanner;

public class Marksheet{
    String[] subjects;
    double[] marks;
    Scanner input;
    
    public Marksheet(String[] subjects){
        inut=new Scanner(System.in);
        this.subjects=subjects;
        marks=new double[this.subjects.length];
    }
    
    public void entry(){
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("\r\nEnter marks for %subjects:", subjects[i]);
            marks[i] = input.nextInt();

        }
    }
    public double getTotal(){
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }
    public boolean isFail() {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 32) {
                return true;
            }
        }
        return false;
    }
    public void getGread() {
        double p=getTotal()/subjects.length;
        if (p >= 80) {
            System.out.println("Distinction");
        } else if (p < 80 && p >= 60) {
            System.out.println("First Divison");
        } else if (p < 60 && p >= 45) {
            System.out.println("Second Divison");
        } else {
            System.out.print("Third Divison");
        }

    }

}
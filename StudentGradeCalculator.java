import java.util.Scanner;
public class StudentGradeCalculator
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student Name:");
        String name = sc.nextLine();
        System.out.println("enter no.of subjects");
        int n = sc.nextInt();
        int total = 0;
        for(int i = 1;i <=n;i++)
        {
            System.out.println("enter marks of subjects "+i+"(out of 100)");
            int marks = sc.nextInt();
            while(marks < 0 || marks > 100)
            {
                System.out.println("Invalid marks..");
                marks = sc.nextInt();
            }
            total+=marks;
}
            
            Double average = (double)total/n;
            String grade;
        if(average>=90)
            grade = "A";
        else if(average>=80 && average< 90)
           grade = "B";
        else if(average >=70 && average < 80)
            grade = "C";
        else if(average >=60 && average < 70)
           grade = "D";
        else if(average >=50 && average < 60)
            grade = "E";
        else
            grade = "F";
    System.out.println("-------Student Report Card--------");
    System.out.println("Name of the Student: "+name );
    System.out.println("Total marks: "+total);
    System.out.println("Average of total marks: "+average);
    System.out.println("overall grade: "+grade);
    if(average>=35)
        System.out.println("Status: PASS");
    else
        System.out.println("Status: FAIL");


        


        
    }
}
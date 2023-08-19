import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Calculator
{
    int subjects;
    float marks[];
    float percentage;
    float total=0;
    Calculator(int n)
    {
        subjects=n;
        marks=new float[n];
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<subjects;i++)
        {
            System.out.println("Enter the marks of "+(i+1)+ "subjects (out of 100):");
            marks[i]=sc.nextFloat();
            total=total+marks[i];
        }
        sc.close();
    }
    void cal_percentage()
    {
        percentage=(total/(subjects*100.00f))*100;
    }
    void display()
    {
        cal_percentage();
        System.out.println("Total marks are "+total);
        System.out.println("Average percentage are "+percentage);
        if(percentage>=90)
        {
            System.out.println("Grade:A+");
        }
        else if(percentage>=80 && percentage<90)
        {
            System.out.println("Grade:A");
        }
        else if(percentage>=65 && percentage<80)
        {
            System.out.println("Grade:B");
        }
        else if(percentage>=45 && percentage<65)
        {
            System.out.println("Grade:c");
        }
        else if(percentage>=35 && percentage<45)
        {
            System.out.println("Grade:D");
        }
        else
        {
            System.out.println("Grade:Fail");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of subjects:");
        int n=sc.nextInt();
        Calculator C=new Calculator(n);
        C.accept();
        C.display();
    }
}

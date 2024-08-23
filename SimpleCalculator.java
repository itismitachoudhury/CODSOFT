import java.util.*;

public class SimpleCalculator {
    public static void studentgrade(){
         int marks[]=new int[6];
         
         double total=0;
        double avg=0;
        Scanner Sc= new Scanner(System.in);

         System.out.println("Enter the marks of student:");
         for (int i=0; i<=5;i++){
            System.out.println("Enter subject marks"+(i+1));
              marks[i]=Sc.nextInt();
              total= total + marks[i];
         }
          System.out.println("the total marks are :"+total); 
          avg=total/5;
          System.out.println("The average percentage obtained by the student:" + avg); 

          System.out.println("the grade of student is:");
          if (avg>=80){
            System.out.println("A");
          }
          else if(avg>=60 && avg<=80){
            System.out.println("B");
          }
          else if(avg>=40 && avg<=60){
            System.out.println("C");
          }
            else if(avg>=25 && avg<=40){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
      }
      public static void main(String [] args){
        studentgrade();

      }
    } 


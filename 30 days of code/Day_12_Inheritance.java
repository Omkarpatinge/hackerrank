import java.util.*;

class Person {
  protected String firstName;
  protected String lastName;
  protected int idNumber;
  
  // Constructor
  Person(String firstName, String lastName, int identification){
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = identification;
  }
  
  // Print person data
  public void printPerson(){
     System.out.println(
        "Name: " + lastName + ", " + firstName 
      +   "\nID: " + idNumber); 
  }
   
}

class Student extends Person{
	private int[] testScores;
    int total=0;
    
   Student(String firstName,String lastName,int id,int testScore[]){
       		
       super(firstName,lastName,id);
       testScores=new int[testScore.length];
       for(int i=0;i<testScore.length;i++){
        testScores[i]=testScore[i];
           total+=testScore[i];
           }
       total=total/testScore.length;
   }
    
    public char calculate(){

        if (total >= 90 && total <= 100)
           return 'O';
       else if (total >= 80 && total < 90)
           return 'E';
       else if (total >= 70 && total < 80)
           return 'A';
       else if (total >= 55 && total < 70)
           return 'P';
       else if (total >= 40 && total < 55)
           return 'D';
       else
           return 'T';
           
    }
    
    
}

class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String firstName = scan.next();
    String lastName = scan.next();
    int id = scan.nextInt();
    int numScores = scan.nextInt();
    int[] testScores = new int[numScores];
    for(int i = 0; i < numScores; i++){
      testScores[i] = scan.nextInt();
    }
    scan.close();
    
    Student s = new Student(firstName, lastName, id, testScores);
    s.printPerson();
    System.out.println("Grade: " + s.calculate());
  }
}
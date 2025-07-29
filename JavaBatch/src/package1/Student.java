package package1;



/*
 Assignment 1 - Create a class named Student

put two variables
put two methods----print some message

Create two objects of the class
call the variables and methods with the help of those two objects...
*/

public class Student {

      String name = "amit" ;
      int rollNo = 2;
      public void getRollNo(){
          System.out.println("Roll no is " + rollNo);
      }
      public void getName(){
          System.out.println("Name is " + name);
      }

    public static void main(String[] args) {
        Student a = new Student();
        //calling variable
        System.out.println(a.name +"   "+  a.rollNo);
        a.getName();
        a.getRollNo();

    }

}


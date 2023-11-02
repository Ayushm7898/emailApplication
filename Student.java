package StudentDataBaseApp;

import java.util.Scanner;

public class Student {
    private String firstName ;
    private String lastName ;
    private int gradeYear ;
    private String studentID ;
    private String courses ="";
    private int tuitionBalance =0;
    private int costOFCourse=600;
    private static int id=1000;
  public Student(){
      Scanner in=new Scanner(System.in);
      System.out.print("Enter Student first name : ");
      this.firstName=in.nextLine();
      System.out.print("Enter Student last name : ");
      this.lastName=in.nextLine();
      System.out.print("Enter Student year\n1 - for freshman\n2 - for sephore\n3 - for junior\n4 - for senior");
      this.gradeYear=in.nextInt();
      setID();
    //  System.out.println(firstName+" "+lastName+" Year is "+gradeYear +" student id "+studentID);
  }

    private void setID() {
         this.studentID=gradeYear+""+id;
         id++;
    }
    public void enroll(){
      while (true) {
          System.out.print("Enter course Q for quit");
          Scanner in=new Scanner(System.in);
          String cousre=in.nextLine();
          if(!cousre.equals("Q")){
          courses=courses+"\n"+cousre;
          tuitionBalance+=costOFCourse;
          }else{
              break;
          }
      }
      //  System.out.println("Your courses are"+ courses);

  }
  public void viewbalance(){
      System.out.println("Your tuition balance is - "+ tuitionBalance);
  }
  public void payment(){
      viewbalance();
      System.out.print("Pay fees RS-");
      Scanner in=new Scanner(System.in);
      int pay=in.nextInt();

      tuitionBalance=tuitionBalance-pay;
      System.out.println("Thanks for paymrnt ");
//      viewbalance();

  }
  public String showInfo(){
      return firstName.toUpperCase()+" "+lastName.toUpperCase() +"\n"
              +"Grade Level - "+gradeYear+"\n"+
              "Courses Enrolled - "+courses +"\n"+
              "Tiution Balance - RS "+ tuitionBalance;

  }
}

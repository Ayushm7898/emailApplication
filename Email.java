package EmialAppication;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String passward;
    private String deparment;
    private int defualtpasslength =10;
    private int mailBoxCapacity=500;
    private String alternativemail;
    private String email;
    private String companysyntex="ayucompany.com";
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("EMAIL CREATES :"+this.firstName+" "+this.lastName);
        this.deparment=setDeparment();
        System.out.println("DEPARMENT :"+ this.deparment);


        this.passward=randompass(defualtpasslength);
        System.out.println("your password :"+this.passward);
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+deparment+"."+companysyntex;
        System.out.println("your  email is :"+email);


    }

    private String randompass(int length) {
        String password="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$%";
        char[] pass=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*password.length());
            pass[i]=password.charAt(rand);
        }
        String  s = new String(pass);
        return s;
    }

    private String setDeparment() {
        System.out.println(" CHOOSE CODE\n1 for sales\n2 for develpment\n3 for Accountning\n0 for none \nenter department code  ");
        Scanner input=new Scanner(System.in);
        int code=input.nextInt();
        if(code==1){return "Sales" ;}
        if(code==2){return "Development" ;}
        if(code==3){return "Accounting" ;}
        else {return "";}
    }
    public void setmailBoxCapacity(int setCapacity){
        this.mailBoxCapacity=setCapacity;
    }
    public void changepassward(String passward){
        this.passward=passward;
    }
    public void setaltemail(String altemail){
        this .alternativemail=altemail;
    }

   
}
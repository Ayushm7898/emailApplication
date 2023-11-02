package StudentDataBaseApp;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        System.out.println("Enter number which you want to enroll : ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Student[]  students =new Student[n];
        for (int i=0;i<n;i++){
            students[i]=new Student();
            students[i].enroll();
            students[i].payment();

        }
        for (int i = 0; i < n; i++) {
            System.out.println( students[i].showInfo());
        }
    }
}

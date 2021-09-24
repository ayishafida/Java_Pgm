/* Program to create a class for Employee having attributes eNo, eName eSalary.Read n employ information and Search for an employee given eNo, using the concept of Array of Objects. */
import java.util.Scanner;

public class P04 {
    int ENo;
    String EName;
    double ESalary;

    Scanner sc = new Scanner(System.in);

    void GetData() {

        System.out.println("Enter Employee No. : ");
        ENo = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Employee Name : ");
        EName = sc.nextLine();
        System.out.println("Enter Employee salary : ");
        ESalary = Integer.parseInt(sc.nextLine());
    }

    void PutData() {
        System.out.println("Employee Number : " + ENo);
        System.out.println("Employee Name : " + EName);
        System.out.println("Employee Salary : " + ESalary);
        System.exit(0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        int n;
        System.out.println("Enter number of Employees : ");
        size = sc.nextInt();
        P04[] arr = new P04[size];
        int i;
        for (i = 0; i < size; i++) {
            arr[i] = new P04();
        }
        for (i = 0; i < size; i++) {
            System.out.println("Enter details of "  + " Employee"+ " "+ (i + 1));
            arr[i].GetData();
        }

        System.out.println("Enter the Employee Number to search the Employee : ");
        n = sc.nextInt();

        for (i = 0; i < size; i++) {
            if (arr[i].ENo == n) {
                System.out.println("Details of Employee");
                arr[i].PutData();
            }
        }
        System.out.println("Enter a valid Employee Number");

    }

}
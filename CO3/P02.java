//Create a class ‘Employee’ with data members Empid, Name, Salary, Address and
constructors to initialize the data members. Create another class ‘Teacher’ that inherit the
properties of class employee and contain its own data members department, Subjects taught
and constructors to initialize these data members and also include display function to
display all the data members. Use array of objects to display details of N teachers.


import java.util.Scanner;  
class Employee
 {
    int empid;
    String name;
    int salary;
    String address;
    Employee()
       {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the empid : "); 
        empid = sc.nextInt();
        System.out.print("Enter the name : "); 
        name = sc.next();
        System.out.print("Enter the  salary : "); 
        salary = sc.nextInt();
        System.out.print("Enter address: "); 
        address = sc.next();
      }
}
class Teachers extends Employee
{
  String department;
  String subject;
  Teachers()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the department:");
   department=sc.next();
   System.out.println("enter subject taught:");
   subject=sc.next();
  }
void display()
{
System.out.println("empid:"+super .empid);
System.out.println("name:"+super .name);
System.out.println("salary:"+super .salary);
System.out.println("address:"+super .address);
System.out.println("department:"+department);
System.out.println("subject taught:"+subject);
System.out.println();
}
}
public class P02
{
  public static void main(String args[])
  {
    int n;
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the number of object:");
   n=sc.nextInt();
  Teachers obj[]=new Teachers[n];
  for(int i=0;i<n;i++)
  {
    obj[i]=new Teachers();
  }
 for(int i=0;i<n;i++)
 {
   obj[i].display();
 }
 }
}
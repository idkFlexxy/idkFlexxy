import java.util.*;
class Student
{
Scanner sc=new Scanner(System.in);
String Enrollment_id;
String name;
int sub1,sub2,sub3,total;
Student()
{
readStudentInfo();
}
public void readStudentInfo()
{
System.out.println("Enter Student Details");
System.out.println("Enrollment Id:");
Enrollment_id=sc.next();
System.out.println("Name:");
name=sc.next();
System.out.println("Enter marks in 3 subjects:");
sub1=sc.nextInt();
sub2=sc.nextInt();
sub3=sc.nextInt();
if(sub1>=50 && sub2>=50 && sub3>=50)
total=sub1+sub2+sub3;
else
total=0;
}
public void displayInfo()
{
System.out.println(Enrollment_id+"\t\t"+name+"\t"+total);
}
}
class StudentDemo
{
public static void main(String args[])
{
Student s[]=new Student[3];
for(int i=0; i<3; i++)
{
s[i]=new Student();
}
System.out.println("Student Details");
System.out.println("Enrollment_id\tname\ttotal");
for(int i=0; i<3; i++)
{
s[i].displayInfo();
}
}
}
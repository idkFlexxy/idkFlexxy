class Student1
{
static String college="Presidency College";
int rollno;
String name;
Student1(int rollno, String name)
{
this.rollno=rollno;
this.name=name;
}
void display()
{
System.out.println(college+" "+rollno+" "+name);
}
}
class StaticDemo
{
public static void main(String[] args)
{
System.out.println("Objects sharing the static variable - college");
Student1 s1=new Student1(111,"Avinash");
Student1 s2=new Student1(112,"Sandhya");
s1.display();
s2.display();
System.out.println("Static value changed by one of the object");
s1.college="M S Ramaiah College";
s1.display();
s2.display();
}
}
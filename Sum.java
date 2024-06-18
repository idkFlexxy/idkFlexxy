class Sum {
 
 int sum(int x, int y)
 {
 return (x + y);
 }
double sum(double x, double y)
 {
 return (x + y);
 }
 int sum()
 {
return(4+5);
 }
 public static void main(String args[])
 {
 Sum s = new Sum();
 System.out.println(s.sum(15, 20));
 System.out.println(s.sum(10.25, 20.50));
 System.out.println(s.sum());
 }}
class details
{
    details()
    {
        System.out.println("this is chaithanya");
    }
        details(int  x)
    {
        System.out.println("my age is:"+x);
    }
     details(int x, int y)
    {
        System.out.println("I have been working as a lab assist in aditya degree college for "+x+"years,"+"my salary is:"+y);
    }
}
class myself
{
 public static void main(String args[]) 
{
  details ad= new details();
 details ad1= new details(20);
 details ad2= new details(3,10000);	 
        }
}

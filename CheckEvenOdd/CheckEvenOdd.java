public class CheckEvenOdd 
{
    public static void main(String args[])
    {
        int x=5, y=10;
        if(x%2==0)
        {
            System.out.println(x + " is even.");
        }
        else
        {
            System.out.println(x + " is odd.");
        }

        String checkY = (y%2==0) ? "even" : "odd";
        System.out.println(y + " is " + checkY + ".");
    }
}
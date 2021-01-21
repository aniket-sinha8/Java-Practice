public class ArmstrongNumber {
    public static void main(String args[]) {
        int n=371, m, temp=0;
        m=n;
        while(m>0)
        {
            int d = m%10;
            int p = (int)(Math.pow(d,3));
            temp = temp + p;
            m /= 10;
        }
        if(temp == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
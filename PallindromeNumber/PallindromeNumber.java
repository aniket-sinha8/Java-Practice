public class PallindromeNumber {
    public static void main(String args[]) {
        int n=333, m, rev=0;
        m=n;
        while(m>0)
        {
            rev=(rev*10) + (m%10);
            m = m/10;
        }
        if(rev == n)
            System.out.println(n + " is a Pallindrome number.");
        else
            System.out.println(n + " is not a Pallindrome number.");
    }
}
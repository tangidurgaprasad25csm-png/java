import java.util.Scanner;
public class PrimePalindrome {
public static void main(String[] args) {
    int n,i,prime=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    n=sc.nextInt();
    sc.close();
    for(i=2;i<n-1;i++){
        if (n%i==0) {
            prime=1;
            break;
            
        }

    }
    int temp=n;
    int rev=0;
    while(temp>0){
        int dig=temp%10;
         rev=rev*10+dig;
         temp=temp/10;
    }
    if (prime ==0 && n==rev) {
        System.out.println("GIVEN NUMBER IS PRIME PALINDROME");
        
    }
    else
        System.out.println("given number is not prime palindrome number");
    
}
}

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     int corprime = 0;
       
     System.out.println(computeTotient(number));
  }
// Computes totien of all numbers
// smaller than or equal to n.
  public static int computeTotient(int n){
      int tot = n; //this will be the totient at the end of the sample
      for (int p = 2; p*p <= n; p++)
      {
          if (n%p==0)
          {
              tot /= p;
              tot *= (p-1);
              while ( n % p == 0 ) 
                  n /= p;
          }
      }
      if ( n > 1 ) { // now n is the largest prime divisor
          tot /= n;
          tot *= (n-1);
      }
    return tot;
    }
}

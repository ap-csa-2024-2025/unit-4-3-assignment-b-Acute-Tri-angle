import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // You can test your method here
    // System.out.println(isPrime(1));
    // System.out.println(isPrime(17));
    System.out.println("type an integer duma");
    int x = sc.nextInt();
    System.out.println(isPrime(x));
    sc.close();
  }

  public static boolean isPrime(int N)
  {
    if (N == 1){
      return false;
    }
    for (int i = 2; i <= N / 2; i++){
      if (N % i == 0){
        return false;
      }
    }
    return true;
  }
}

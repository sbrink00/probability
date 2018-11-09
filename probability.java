public class probability{
  public static int factorial(int num){
    if (num == 0 || num == 1) return 1;
    else return num * factorial(num - 1);
  }

  public static int npr(int n, int r){
    return factorial(n)/factorial(n - r);
  }



}

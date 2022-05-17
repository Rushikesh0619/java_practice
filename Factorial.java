public class Factorial {
    public static int printfactorial(int n){
      if(n==1||n==0){
          return 1;
      }
      int fact1= printfactorial(n-1);
      int fact=n*fact1;
      return fact;
    }
    public static void main(String args[]){
        int x=printfactorial(5);
        System.out.println(x);
    }
    
}

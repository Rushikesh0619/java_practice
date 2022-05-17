//Time complexity O(n^2 - 1) or O(n^2)
public class Hanoi {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
          System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
          return;
        }
        //transfer n-1 to dest
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
   public static void main(String args[]){
       int n=3;
       towerOfHanoi(n,"s","Helper","dest");
   } 

}
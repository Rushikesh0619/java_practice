public class Recursesum {
    public static void resum(int i,int n,int sum){
       if(i==n){
           sum+=i;
           System.out.println(sum);
           return;
       }
        sum+=i;
        
       resum(i+1,n,sum);
       
        
    }
    public static void main(String args[]){
        resum(1,10,0);
    }
            
}

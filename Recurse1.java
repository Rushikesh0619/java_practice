public class Recurse1 {
    public static void printNum(int n){
        //base
        if(n==6)
            return;
        //print
        System.out.println(n);
        //recursion
        printNum(n+1);
    }
    public static void main(String arg[]){
        printNum(1);
    }
    
}

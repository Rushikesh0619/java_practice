//Print all subsequences of strings time complexity O(2^n)
public class allSubsequenses {
    public static void subsequences(String str,int i,String newString){
        if(i==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(i);
        // in subsequence
        subsequences(str,i+1,newString+currChar);
        //not in subsequnce
        subsequences(str,i+1,newString);
    }
    public static void main(String args[]){
        String str="abc";
        subsequences(str,0,"");
    }
}

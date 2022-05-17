//Print all unique sunsequences
import java.util.HashSet;
public class UniqueSubsequences {
    public static void subsequences(String str,int i,String newString,HashSet<String> set){
        if(i==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
            
        }
        char currChar=str.charAt(i);
        // in subsequence
        subsequences(str,i+1,newString+currChar,set);
        //not in subsequnce
        subsequences(str,i+1,newString,set);
    }
    public static void main(String args[]){
        String str="aaa";
        HashSet<String> set =new HashSet<>();
        subsequences(str,0,"",set);
    }
}

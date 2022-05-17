//string reverse using recursion time complexity= O(n) n=length of string
public class stringReverse {
    public static void strreverse(String str,int i){
        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        strreverse(str,i-1);
    }
    public static void main(String args[]){   
        String str="abcd";
        strreverse(str,str.length()-1);
    } 
}

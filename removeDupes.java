//remove duplicates from string using recursion
public class removeDupes {
    public static boolean[] map=new boolean[26];
    
    public static void reDupes(String str,int i,String newString){
        if(i == str.length()){
        System.out.println(newString);
        return;
    }
        char currChar=str.charAt(i);
        if(map[currChar-'a']==true){
            reDupes(str,i+1,newString);
        }else{
            newString+=currChar;
            map[currChar-'a']=true;
            reDupes(str,i+1,newString);
        }
    }
    public static void main(String args[]){
        String str="abbccda";
        reDupes(str,0,"");
    }
}

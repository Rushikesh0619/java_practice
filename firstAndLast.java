public class firstAndLast {
    public static int first= -1;
    public static int last= -1;
    public static void findOccurrence(String str,int i,char ele){
        if(i==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar=str.charAt(i);
        if(currchar==ele){
            if(first==-1){
                first=i;
            }
            else{
                last=i;
            }
        }
        findOccurrence(str,i+1,ele);
    }
    public static void main(String args[]){
        String str="abaacdaefaah";
        findOccurrence(str,0,'a');
    }
}

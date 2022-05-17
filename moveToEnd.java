//move all x to end of string
public class moveToEnd {
    public static void moveAllx(String str,int i,int count,String newString){
        if(i==str.length()){
            for(int j=0;j<count;j++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(i);
        if(currChar=='x'){
            count++;
            moveAllx(str,i+1,count,newString);
        }else{
            newString+=currChar;
             moveAllx(str,i+1,count,newString);
        }
    }
    public static void main(String args[]){
        String str="axbcxxd";
        moveAllx(str,0,0,"");
    }
}

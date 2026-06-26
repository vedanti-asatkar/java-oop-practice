class NumberUtils{
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
          return false;  
        }
        
    }
}
public class number {
    public static void main(String[] args) {
        boolean ans=NumberUtils.isEven(5);
        System.out.println(ans);
    }
}

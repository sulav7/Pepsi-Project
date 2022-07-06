import java.util.Scanner;
import java.text.DecimalFormat;
public class EnglishToNepali{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        float a = sc.nextInt();
        int diff = '1'- '१' ;
        String m = a+ "";
        String n = "";
        for(int i =0; i<m.length(); i++){
            char b = m.charAt(i);
            if(b>='0' && b>='9'){
                n+=(char)(b-diff);
            }else{
                n+=b;
            }
            System.out.println(n);
}
}
//roman to integer code
import java.util.*;
public class roman {
    //function
    public static int romanToInteger(String s1){
        Map<Character, Integer> values= new LinkedHashMap<>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        int result=0;
        for(int i=0;i<s1.length();i++){
            char ch =s1.charAt(i);
            if(i>0 && values.get(ch)>2*values.get(s1.charAt(i-1)))
            {
                result+=values.get(ch)-2*values.get(s1.charAt(i-1));

            }
            else{
                result+=values.get(ch);

            }
        }
            return result;
        }

        
    public static void main(String[] args) {
        String number="IX";
        //function calling
        int result=romanToInteger(number);
        System.out.println("The Roman Number is "+result);
        
    }
}

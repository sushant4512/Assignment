//shuffle array code
import java.util.Random;
public class shuffleArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Random ran=new Random();
        for(int i=0;i<arr.length;i++){
            int index= ran.nextInt(i+1);
            int temp = arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        for(int i: arr){
            System.out.println(i+" ");
        }

    }
}

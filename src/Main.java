import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        ArrayList<Object> arrayList=new ArrayList<>();
        ArrayList<Object> arrayList2=new ArrayList<>();
        ArrayList<Object> arrayList3=new ArrayList<>();

        Random ran=new Random();
        for (int i = 0; i <=50 ; i++) {
            int a= ran.nextInt(1,101);
           arrayList.add(a);
            if (a % 2 == 0) {
               arrayList2.add(a);
            } else {
                arrayList3.add(a);
            }
        }
        System.out.print("chykkan sandar "+arrayList+"\n");
        System.out.print("jup sandar "+arrayList2+"\n");
        System.out.print(" tak sandar "+arrayList3);

    }
}
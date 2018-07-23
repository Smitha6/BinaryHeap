
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HW7 extends HW7_AbstractClass {

    public static void main(String args[]){
        HW7 o = new HW7();

        //how many items in list?
        Scanner scanner = new Scanner( System.in );


        System.out.print("How many items in list?: ");
        int input = scanner.nextInt();
        o.selection1(input);
        o.selection2(input);



    }


    public int selection1(int N){
        Random r = new Random();
        BinaryHeap<Integer> binaryHeap = new BinaryHeap<>(N);
        int ran;
        //adds random numbers into array
        for(int i = 0; i < N; i++){
            ran = r.nextInt((100 - 1) + 1);
            binaryHeap.insert(ran);
            System.out.println("#1 " + ran);
        }
        try{
            int min = binaryHeap.deleteMin();
            System.out.println("Delete 2: " + min);
            return min;

        }
        catch(Exception e) {
            System.out.println(e);
        }
        return -1;
    }



    public int selection2(int N){
        Random r = new Random();
        BinaryHeap<Integer> binaryHeap = new BinaryHeap<>(N);
        int ran;
        int M = N/2;

        for(int i = 0; i < M; i++){
            ran = r.nextInt((100 - 1) + 1);
            binaryHeap.insert(ran);
            System.out.println("#2 " + ran);
        }


        try{
            for(int i = 0; i < M; i++){
                ran = r.nextInt((100 - 1) + 1);
                if(ran > binaryHeap.findMin()){
                    binaryHeap.deleteMin();
                    binaryHeap.insert(ran);
                }
            }
            System.out.println("Delete 2: " + binaryHeap.findMin());
            return binaryHeap.findMin();
        }
        catch(Exception e){
            System.out.println(e);
        }
        //generate N random numbers
        return -1;
    }
}


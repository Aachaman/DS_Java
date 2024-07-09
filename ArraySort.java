import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int a1[]= new int[] {3,6,2,9,5,8,1};
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

        Arrays.sort(a1);
        System.out.println();
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

        int value = search(a1,1);
        if(value==-1)
            System.out.println("Key is not there.");
        else
            System.out.println("key is present at index "+value);

    }

    public static int search(int array[],int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    
}

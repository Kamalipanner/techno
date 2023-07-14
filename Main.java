import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
  
    int[] array = {1,2,3,4,5};
 
    int k = 3;
 
    System.out.println("Original Array");
    System.out.println(Arrays.toString(array));
    rightRotation(array,k);
    System.out.println("After right rotation Array");
    System.out.println(Arrays.toString(array));
  }
 
  public static void rightRotation(int[] arr, int k) {
    k = k%arr.length;
    for(int i = 0; i < k; i++) {    
      int j, last;    
      last = arr[arr.length-1];    
      for(j = arr.length-1; j > 0; j--) {    
        arr[j] = arr[j-1];    
      }    
      arr[0] = last;            
    }
  }
}
output:
Original Array
[1, 2, 3, 4, 5]
After right rotation Array
[3, 4, 5, 1, 2]
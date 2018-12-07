import java.util.Arrays;

public class Sorts {

  public static void selectionSort(int [] ary) {
    for (int i = 0; i < ary.length; i++) {
      int smallest = i;
      for (int x = i; x < ary.length; x++) {
        if (ary[x] < ary[smallest]) {
          smallest = x;
        }
      }
      int temp = ary[i];
      ary[i] = ary[smallest];
      ary[smallest] = temp;
    }
  }

  public static void bubbleSort(int[] data){
    boolean sorted = false;
    while (!sorted) {
      int swap = 0;
      for (int i = 0; i < data.length - 1; i++) {
        if (data[i] > data[i+1]) {
          int temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
          swap++;
        }
      }
      if (swap == 0) {
        sorted = true;
      }
    }
  }

  public static void main(String[] args) {
    int[] array = {4, 2, 9, 1, 0, -4, 3, 8, 7, 3};
    Sorts.bubbleSort(array);
    System.out.println(Arrays.toString(array));
  }

}

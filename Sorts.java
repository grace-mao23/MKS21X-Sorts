import java.util.Arrays;

public class Sorts {

  // find smallest and move to front
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

  // switches place by place until no swaps made
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

  // looks at each element and "inserts" them into the right place
  public static void insertionSort(int[] data) {
    for (int i = 1; i < data.length; i++) {
      int current = data[i];
      int j = i-1;
      while (j >= 0 && data[j] > current) {
        data[j+1] = data[j];
        j--;
      }
      data[j+1] = current;
  /*    int newPlace = i;
      for (int x = i - 1; x >= 0; x--) {
        if (data[x] > current) {
          data[x+1] = data[x]; // shifting
          newPlace = x; // where should current be
        }
        data[newPlace] = current;
      } */
    }
  }

  public static void main(String[] args) {
    int[] array = {6,8,9,5,3,10};
    Sorts.insertionSort(array);
    System.out.println(Arrays.toString(array));
  }

}

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



}

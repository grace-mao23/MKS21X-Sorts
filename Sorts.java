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

  public static void main(String[] args) {
    int[] array = {4, 2, 9, 1, 0, -4, 3, 8, 7, 3};
    Sorts.selectionSort(array);
    for (int i : array) {
      System.out.println(i);
    }
  }

}

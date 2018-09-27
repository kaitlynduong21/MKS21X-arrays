public class ArrayDemo {

  public static void printArray(int[]ary){
    System.out.print("[");
    for (int i =0; i < ary.length; i++) {
      if (i < ary.length - 1) {
        System.out.print(ary[i] + ", ");
    } else {
      System.out.print(ary[i]);
    }
  }
    System.out.print("]");
  }

  public static void main(String[] args) {
    int[] anArray;
    anArray = new int [11];
    for (int i =0; i < anArray.length; i++) {
      anArray[i] = 100 + i * 10;
    }
    printArray(anArray);
  }
}

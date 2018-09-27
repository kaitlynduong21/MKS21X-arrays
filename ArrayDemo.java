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
    System.out.println("]");
  }

  public static void printArray(int[][]ary){
    for (int n = 0; n < ary.length; n++) {
      for(int i = 0; i < (ary[0]).length; i++) {
        if (i == 0) {
          System.out.print("[" + ary[n][i] + ", ");
        } else {
          if (i == ary[n].length - 1) {
            System.out.println(ary[n][i] + "]");
          } else {
            System.out.print(ary[n][i] + ", ");
          }
        }
      }
    }
  }

  public static int countZeros2D(int[][] nums){
    int count = 0;
    for(int n = 0; n < nums.length; n++) {
      for(int i = 0; i < nums[0].length; i++) {
        if (nums[n][i] == 0) {
          count++;
        }
      }
    }
    return count;
  }


  public static void main(String[] args) {
    int[] anArray;
    anArray = new int [11];
    for (int i =0; i < anArray.length; i++) {
      anArray[i] = 100 + i * 10;
    }
    printArray(anArray);
    int[][] anArray1;
    anArray1 = new int [2][3];
    for (int n = 0; n < anArray1.length; n++) {
      for(int i = 0; i < anArray1[0].length; i++) {
        anArray1[n][i] = (i) * (n + 1);
      }
    }
    printArray(anArray1);
    System.out.println("There are " + countZeros2D(anArray1) + " zeroes.");
  }
}

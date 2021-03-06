public class ArrayDemo {

  public static void printArray(int[]ary){
    System.out.print("{");
    for (int i =0; i < ary.length; i++) {
      if (i < ary.length - 1) {
        System.out.print(ary[i] + ", ");
    } else {
      System.out.print(ary[i]);
    }
  }
    System.out.println("}");
  }

  public static void printArray(int[][]ary){
    System.out.print("{");
    for (int n = 0; n < ary.length; n++) {
      for(int i = 0; i < (ary[n]).length; i++) {
        if (i == 0) {
          System.out.print("{" + ary[n][i] + ", ");
        }
        if (i == ary[n].length - 1) {
          System.out.print(ary[n][i] + "}");
        }
        if (i != 0 && i != (ary[n].length - 1)) {
          System.out.print(ary[n][i] + ", ");
        }
      }
        if (n != ary.length - 1) {
          System.out.println(",");
        }
      }
    System.out.println("}");
  }


  public static int countZeros2D(int[][] nums){
    int count = 0;
    for(int n = 0; n < nums.length; n++) {
      for(int i = 0; i < nums[n].length; i++) {
        if (nums[n][i] == 0) {
          count++;
        }
      }
    }
    return count;
  }

  public static void fill2D(int[][] vals){
    for(int n = 0; n < vals.length; n++) {
      for(int i = 0; i < vals[n].length; i++) {
        if (i == n) {
          vals[n][i] = 3;
        } else {
          vals[n][i] = 1;
        }
      }
    }
    printArray(vals);
  }

  public static int[][] fill2DCopy(int[][] vals){
    int[][] newArray;
    newArray = new int [vals.length][vals[0].length];
    for(int n = 0; n < newArray.length; n++) {
      for(int i = 0; i < newArray[n].length; i++) {
        if (vals[n][i] < 0) {
          newArray[n][i] = 3;
        } else {
          newArray[n][i] = 1;
        }
      }
    }
    printArray(newArray);
    return newArray;
  }

  public static void main(String[] args) {
    int[] anArray;
    anArray = new int [11];
    for (int i =0; i < anArray.length; i++) {
      anArray[i] = 100 + i * 10;
    }
    printArray(anArray);
    int[][] anArray1 = new int [2][3];
    for (int n = 0; n < anArray1.length; n++) {
      for(int i = 0; i < anArray1[0].length; i++) {
        anArray1[n][i] = (i * 3 - 4) * (n + 1);
      }
    }
    printArray(anArray1);
    System.out.println("There are " + countZeros2D(anArray1) + " zeroes.");
    fill2DCopy(anArray1);
    fill2D(anArray1);
  }
}

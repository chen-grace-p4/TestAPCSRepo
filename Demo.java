public class Demo {
  public static void main(String[]args) {
    // if (args.length == 0) {
    //   printLoop(5);
    // } else {
    //   int a = Integer.parseInt(args[0]);
    //   printLoop(a);
    // }

    // int[] a = {1, 2, 3};
    // int[] b = {1, 2, 3, 4};
    // int[] c = {1, 2};
    // int[] d = {};
    // int[] e = {1, 2, 3, 4, 5};
    // int[][] all = {a, b, c, d, e};

    //System.out.print(arrayDeepToString(create2DArrayRandomized(4,10,100)).replace("}, ","},\n "));
  }
  public static void printLoop(int n){
      int times  = n;
      for(int i = 1; i <= n; i++){
        for (int j = 1; j <= times; j++) {
          System.out.print(i);
      }
      times = times - 1;
      System.out.println();
    }
  }

  public static String arrToString(int[] arr) {
    String newstring = "{";
    for (int i=0; i<arr.length; i++) {
      newstring += arr[i];
      if (arr.length > 1 && i < arr.length-1) {
        newstring += ", ";
        }
    }
    newstring += "}";
    return newstring;
  }
  public static String arrayDeepToString(int[][] arr) {
    String newstring2 = "{";
    for (int overall = 0; overall < arr.length; overall++) {
        newstring2 += arrToString(arr[overall]);
        if (arr.length > 1 && overall < arr.length-1) {
          newstring2 += ", ";
        }
    }
    newstring2 += "}";
    return newstring2;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] result = new int[rows][cols];
    for (int row = 0; row < result.length; row++) {
      for (int col = 0; col < result[row].length; col++) {
        double randomnum = Math.random() * (maxValue+1);
        result[row][col] += randomnum;
      }
    }
    return result;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] result = new int[rows][];

    for (int row = 0; row < result.length; row++) {
      double rancols = Math.random() * (cols+1);
      result[row] = new int[(int)rancols];
      for (int col = 0; col < result[row].length; col++) {
        double randomnum = Math.random() * (maxValue+1);
        result[row][col] += randomnum;
      }
    }
    return result;
  }
}

public class Demo {
  public static void main(String[]args) {
    // if (args.length == 0) {
    //   printLoop(5);
    // } else {
    //   int a = Integer.parseInt(args[0]);
    //   printLoop(a);
    // }
    int[] a = {1, 2, 3};
    int[] b = {1, 2, 3, 4};
    int[] c = {1, 2};
    int[] d = {};
    int[] e = {1, 2, 3, 4, 5};
    int[][] all = {a, b, c, d, e};
    System.out.print(arrayDeepToString(all).replace("}, ","},\n "));	
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
}

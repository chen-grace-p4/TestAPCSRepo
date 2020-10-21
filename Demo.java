public class Demo {
  public static void main(String[]args) {
    if (args.length == 0) {
      printLoop(5);
    } else {
      int a = Integer.parseInt(args[0]);
      printLoop(a);
    }

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
}

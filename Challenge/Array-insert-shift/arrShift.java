public class arrShift {

  static int[] testArr = { 1, 2, 3, 4, 5 };

  public static void main(String[] args) {
    insertShiftArray(testArr, 10);
  }

  public static int[] insertShiftArray(int[] num, int value) {

    int[] newArr = new int[num.length + 1];
    boolean targetOfNextIndexAfterValueIsAdded = false;
    for (int i = 0; i < newArr.length; i++) {
      // System.out.println(newArr.length);

      if (i == newArr.length / 2) {
        System.out.println(i);
        newArr[i] = value;
        System.out.println(newArr[i]);
        targetOfNextIndexAfterValueIsAdded = true;

      } else {
        System.out.println(i);
        if (i == newArr.length - 1) {
          newArr[i] = num[num.length - 1];

        } else {
          if (targetOfNextIndexAfterValueIsAdded) {
            newArr[i] = num[i - 1];
          } else {
            newArr[i] = num[i];
          }

        }
        // System.out.println(newArr[i]);
      }
    }
    return newArr;
  }
}
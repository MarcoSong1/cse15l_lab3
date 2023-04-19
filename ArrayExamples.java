

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static Object reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length / 2; i += 1) {
      int copy = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = copy;
    }
    return arr;
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] output_reversed = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      output_reversed[i] = arr[arr.length - i - 1];
    }
    return output_reversed;
    
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length == 0 || arr.length == 1) {
      return 0;
    }
    double sum_result = 0;
    double lowest = arr[0];
    for(int i = 0; i < arr.length; i += 1) {
      sum_result += arr[i];
      if(arr[i] < lowest) {
        lowest = arr[i];
      }
    }
    return (sum_result - lowest) / (arr.length - 1);
  }


}


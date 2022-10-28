import java.util.ArrayList;

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    
//    for(int i = 0; i < arr.length; i += 1) {
//      arr[i] = newArray[arr.length - i - 1];
//    }
        
//    return arr;
    
    int index = 0;
    for(int i=arr.length -1; i>=0; i--) {
    	newArray[index] = arr[i];
    	index++;
    }
    
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    
    ArrayList<Double> myList = new ArrayList<>();
    
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { 
    	  myList.add(num);
    	  sum += num; 
    	  }
    }
    double average = sum/myList.size();
    
    return average;
  }
  

}


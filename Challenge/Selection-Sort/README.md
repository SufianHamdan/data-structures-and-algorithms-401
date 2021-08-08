# Insertion Sort

the idea behind Insertion Sort is that it loops through the array and compare each value with all the predecessors' values and if the value directly before is less than the current value nothing will happen, but if the value was larger than the current value replace them and compare the same value with the second predecessor and so on.

# Pseudocode

```Pseudocode
 InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
```

# Working Code

```java

    public static void main(String[] args) {

        int [] arr = {8,4,23,42,16,15};
        selectionSort(arr);
        print(arr);
    }

    public static void selectionSort(int[] arr){

        int length = arr.length;

        if(length > 0){
            for(int i = 0; i < length - 1; i++){
                int min = i;
                for(int j = i + 1; j < length; j++){
                    if (arr[j] < arr[min]){
                        min = j;
                    }

                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }else {
            System.out.println("Array is Empty!");
        }

    }

    public static void print(int[] arr){
        String result = "";
        for(Integer e: arr){
            result = result + e + ", ";
        }

        System.out.println(result);
    }
    
```

# Trace



# Efficiency

* Time: O(n^2) Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.
* Space: O(1) No additional space is being created. This array is being sorted in place…keeping the space at constant O(1).
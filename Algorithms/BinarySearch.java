public class BinarySearch {
    int binarySearch(int [] arr, int x){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;

            // if middle element is x, return middle element
            if(arr[middle] == x){
                return middle;
            }
            // if middle element is less than x, ignore left half of array
            if(arr[middle] < x){
                start = middle + 1;
            }
            // if middle element is greater than x, ignore right half of array 
            else{
                end = middle - 1;
            }
        }
        // if element is not in array, return -1
        return -1;
    }
}

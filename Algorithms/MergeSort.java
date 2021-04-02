public class MergeSort {
    void merge(int arr[], int start, int middle, int end){

        // get size of two subarrays
        int size_left_arr = middle - start + 1; //takes middle element for left side
        int size_right_arr = end - middle;

        // create two temp subarrays with sizes
        int [] left_array = new int[size_left_arr];
        int [] right_array = new int[size_right_arr];

        //copy data from original array into two temp subarrays
        for(int i=0; i<size_left_arr; i++){
            left_array[i] = arr[start + i];
        }
        for(int j=0; j<size_right_arr; j++){
            right_array[j] = arr[middle + 1 + j];
        }

        /* merge two temp subarrays*/
        int i = 0;
        int j = 0;
        int k = 1; //
 
        while(i < size_left_arr && j < size_right_arr){
            if(left_array[i] < right_array[j]){
                arr[k] = left_array[i];
                i++;
            }
            else{
                arr[k] = right_array[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of temp left subarray
        while(i < size_left_arr){
            arr[k] = left_array[i];
            i++;
            k++;
        }
        // copy remaining elements of temp right subarray
        while(j < size_right_arr){
            arr[k] = right_array[j];
            j++;
            k++;
        }

    }
    void sort(int [] arr, int start, int end){
        if(start < end){
            int middle = start + (end - start) / 2;

            // sort first half of new array
            // sort second half of new array
            sort(arr, start, middle);
            sort(arr, middle + 1, end);

            //merge two sorted halves
            merge(arr, start, middle, end);
        }
    }
}

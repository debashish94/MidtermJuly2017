package algorithm;

public class Sort {

    long executionTime = 0;

	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j=i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public void bubbleSort(int [] array){
        for (int pass =array.length-1; pass >=0; pass--){
            for (int i= 0; i <=pass-1; i++){
                if (array[i]> array[i+1]){
                    int temp =array[i];
                    array[i] = array[i+1];
                    array [i+1]= temp;
                }
            }
        }
        //int [] list = array;
        //implement here

    }
    

    public void mergeSort(int [] A, int [] temp, int left, int right){
        //int [] list = array;
        //implement here
        int mid;
        if (right>left) {
            mid = (right + left) / 2;
            mergeSort(A, temp, left, mid);
            mergeSort(A, temp, mid + 1, right);
            Merge(A, temp, left, mid+1, right);
        }
    }
    public void Merge(int[]A, int[] temp, int left, int mid, int right){
        int i, left_end, size, temp_pos;
        left_end =mid-1;
        temp_pos=left;
        size =right-left+1;
        while ((left<=left_end)&& (mid<=right)){
            if (A[left]<=A[mid]){
                temp[temp_pos]=temp_pos+1;
                left=left+1;
            }else{
                temp[temp_pos]=A[mid];
                temp_pos=temp_pos+1;
                mid = mid+1;
            }
        }
        while (left<=left_end){
            temp[temp_pos]=A[left];
            left =left+1;
            temp_pos=temp_pos+1;
        }
        while (mid<= right){
            temp [temp_pos]=A[mid];
            mid =mid+1;
            temp_pos=temp_pos+1;
        }
        for (i =0; i<=size; i++){
            A[right] = temp[right];
            right=right-1;
        }
    }
    

    public static void quickSort(int [] A, int low, int high){
        int pivot;
        if (high>low){
            pivot =Partition(A,low, high);
            quickSort(A,low,pivot-1);
            quickSort(A,pivot+1, high);
        }

        //return list;
    }

    private static int Partition (int [] A, int low, int high){
        int left, right, pivot_item = A[low];
        left = low;
        right = high;
        while (left<right){
            //move left while item <pivot
            while (A[left]<=pivot_item)
                left++;
            while (A[right]>pivot_item)
                right--;
            if (left<right)
                swap(A,left,right);
        }
        //right is final position for the pivot
        A[low]=A[right];
        A[right]=pivot_item;
        return right;
    }
    private static void swap (int[] A, int left, int right){
        int temp =0;
        temp =A[left];
        A[left]=A[right];
        A[right]=temp;
    }
    
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        buildHeap(array);
        for(int i = array.length-1; i>=1; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public void heapify(int[] array, int n, int i){
        int max;
        int child;
        child = 2 * i + 1;
        max = i;
        if(child < n){
            if(array[child] > array[max]){
                max = child;
            }
            if(child+1 < n){
                if(array[child + 1] > array[max]){
                    max = child + 1;
                }
            }
            if(max != i){
                int temp = array[i];
                array[i] = array[max];
                array[max] = temp;
                heapify(array, n, max);
            }
        }
    }

    public void buildHeap(int[] array){
        for(int i=array.length/2-1; i >= 0; i--){
            heapify(array, array.length, i);
        }
    }


    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int maxVal = getMax(array);
        int[] bucket = new int[maxVal+1];
        for(int i=0; i<bucket.length; i++){
            bucket[i] = 0;
        }
        for(int i=0; i<array.length; i++){
            bucket[array[i]]++;
        }
        int outPos = 0;
        for(int i=0; i<bucket.length; i++){
            for(int j=0; j<bucket[i]; j++){
                array[outPos++] = i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}

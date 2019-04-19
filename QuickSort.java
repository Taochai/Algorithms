public class QuickSort {
    public void sort(int[] arr, int left, int right){
        if(left<right){
            int pivotIndex = patition(arr,left,right);
            sort(arr,left,pivotIndex-1);
            sort(arr,pivotIndex+1,right);
        }
    }
    public int patition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left;

        for(int j=left;j<right;j++){
            if(arr[j]<pivot){
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                i++;
            }
        }
        int tmp = arr[i];
        arr[i] = arr[right];
        arr[right] = tmp;
        return i;
    }

}

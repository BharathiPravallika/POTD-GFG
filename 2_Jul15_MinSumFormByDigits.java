class Solution{
    public static long minSum(int arr[], int n){
        Arrays.sort(arr);
        long even=0, odd=0;
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                even = (even*10)+arr[i];
            }
            else{
                odd = (odd*10)+arr[i];
            }
        }
        return odd+even;
    }
}

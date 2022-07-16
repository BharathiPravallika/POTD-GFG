class Solution{
    public boolean isKPartitionPossible(int a[], int n, int k){
        if(k==1) return true;
        int arrsum = 0;
        for(int num:a) arrsum += num;
        
        if(arrsum % k != 0) return false;
        
        Arrays.sort(a);
        int i=0, j=n-1;
        while(i<j) swap(a, i++, j--);
        
        boolean[] v = new boolean[n];
        return partitionutil(a, n, v, k, 0, arrsum/k, 0);
        
      }
      private void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
      }
      public boolean partitionutil(int[] a, int n, boolean[] v, int k, int i, int t, int s){
        if(k==0) return true;
        if(t==s) return partitionutil(a, n, v, k-1, 0, t, 0);
        
        for(int j=0; j<n; j++){
          if(v[j] || s+a[j] > t) continue;
          v[j] = true;
          if(partitionutil(a, n, v, k, j+1, t, s+a[j])) return true;
          v[j] = false;
        }
        return false;
      }
}


//output: 1 or 0 will come

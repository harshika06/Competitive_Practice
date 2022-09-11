class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
          int ar[][] = new int[n][2] ;
        for(int i=0; i<n; i++)
        {
            ar[i] = new int[]{efficiency[i],speed[i]} ;               
        }                                                               
        Arrays.sort(ar, (a,b) -> (b[0]-a[0])) ;
       
        long sum = 0;
        long res = 0 ;
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b) ;
        for(int i=0; i<n; i++)
        {
            pq.add(ar[i][1]) ;
            sum = sum + ar[i][1] ;
            if(pq.size()>k)
            {
                sum = sum - pq.poll() ;
            }
            res = Math.max(res,(sum * ar[i][0])) ;
        }                                                                   
        return (int)(res % (long)(1e9 + 7));
    }
}
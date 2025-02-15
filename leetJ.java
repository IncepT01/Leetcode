class Main {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m+n];

        int idx = 0;
        int nIdx = 0;
        int mIdx = 0;

        while (nIdx < n && mIdx < m) {
            if(nums1[mIdx] <= nums2[nIdx]){
                sorted[idx] = nums1[mIdx];
                mIdx++;
            }
            else{
                sorted[idx] = nums2[nIdx];
                nIdx++;
            }
            idx++;
        }

        //There are still items in nums1
        if(nIdx >= n && mIdx < m){
            while (mIdx < m) {
                sorted[idx] = nums1[mIdx];
                mIdx++;
                idx++;
            }
        }
        //There are still items in nums2
        else if(nIdx < n && mIdx >= m){
            while (nIdx < n) {
                sorted[idx] = nums2[nIdx];
                nIdx++;
                idx++;
            }
        }

        //Copy
        for(int i = 0; i < n+m; i++){
            nums1[i] = sorted[i];
        }
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        Main m = new Main();

        m.merge(nums1, 3, nums2, 3); 
        
        for(int i = 0; i < 6; i++){
            System.out.print(nums1[i]);
        }
    }
}
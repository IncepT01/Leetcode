class Main {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m+n];

        int idx = 0;
        int nIdx = 0;
        int mIdx = 0;

        while (nIdx < n && mIdx < m) {
            if(nums1[idx] <= nums2[idx]){
                sorted[idx] = nums1[nIdx];
                nIdx++;
            }
            else{
                sorted[idx] = nums2[mIdx];
                mIdx++;
            }
            idx++;
        }

        //There are still items in nums2
        if(nIdx >= n && mIdx < m){
            while (mIdx < m) {
                sorted[idx] = nums2[mIdx];
                mIdx++;
                idx++;
            }
        }
        //There are still items in nums1
        else if(nIdx < n && mIdx >= m){
            while (nIdx < n) {
                sorted[idx] = nums1[nIdx];
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
    }
}
class Main {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m+n];

        int idx = 0;

        while (idx < n && idx< m) {
            if(nums1[idx] <= nums2[idx]){
                sorted[idx] = nums1[idx];
            }
            else{
                sorted[idx] = nums2[idx];
            }
        }

        
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        Main m = new Main();

        m.merge(nums1, 3, nums2, 3);    
    }
}
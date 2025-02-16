class Main {
    public int removeElement(int[] nums, int val) {
        return -1;
    }

    public static void main(String[] args){
        int[] nums1 = {3,2,2,3};
        int[] nums2 = {2,5,6};

        Main m = new Main();

        m.removeElement(nums1, 3); 
        
        for(int i = 0; i < 6; i++){
            System.out.print(nums1[i]);
        }
    }
}
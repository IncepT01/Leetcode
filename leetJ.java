class Main {
    public int removeElement(int[] nums, int val) {

        int[] res = new int[nums.length];
        int numIdx = 0;
        int cnt = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                cnt++;               
            }
            else{
                res[numIdx] = nums[i];
                numIdx++;
            }
        }

        for(int i = 0; i < numIdx; i++){
            nums[i] = res[i];
        }
        return nums.length - cnt;
    }

    public static void main(String[] args){
        int[] nums1 = {0,1,2,2,3,0,4,2};
        int[] nums2 = {2,5,6};

        Main m = new Main();

        int a = m.removeElement(nums1, 2); 
        
        System.out.println(a);
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i]);
        }
    }
}
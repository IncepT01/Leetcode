import java.util.ArrayList;

class Main {
    int strStr(String haystack, String needle) {

        ArrayList<Integer> idx = new ArrayList<Integer>();

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            int skipCounter = 0;
            boolean found = true;
            for(int c = 0; c < needle.length(); c++){
                if(haystack.charAt(i + c) != needle.charAt(c)){
                    found = false;
                    break;
                }
                else{
                    skipCounter++; 
                }
            }

            if(found){
                idx.add(i);
            }
            //i += skipCounter;
        }

        return idx.size() == 0 ? -1 : idx.get(0);
    }

    public static void main(String[] args){
        int[] nums1 = {0,1,2,2,3,0,4,2};
        int[] nums2 = {2,5,6};

        Main m = new Main();

        int a = m.strStr("sadbutsad", "sad");
        
        System.out.println(a);
        /* 
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i]);
        }
        */
    }
}
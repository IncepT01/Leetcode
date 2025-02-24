import java.util.ArrayList;
import java.util.List;

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

    public static List<int[]> findPairs(int p) {
        List<int[]> pairs = new ArrayList<>();

        // Iterate beyond 2p to include all unique pairs
        for (int a = p + 1; a <= p * p; a++) {
            if ((a * p) % (a - p) == 0) {  // Ensure b is an integer
                int b = (a * p) / (a - p);
                pairs.add(new int[]{a, b});  
                
                // Add (b, a) only if a ≠ b
                if (a != b) {
                    pairs.add(new int[]{b, a});
                }
            }
        }
        return pairs;
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

        int p = 5;  // Example input
        List<int[]> pairs = Main.findPairs(p);

        for (int[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }
}
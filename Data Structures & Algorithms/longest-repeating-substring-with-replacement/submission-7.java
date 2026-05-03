class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int result = 0;
        int[] arr= new int[26];
        int maxOccurence = 0;
        

        for(right=0;right<s.length();right++){
            maxOccurence = Math.max(maxOccurence, ++arr[s.charAt(right)-'A']);
            if(right-left+1 - maxOccurence > k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            result = Math.max(result, right-left+1);
        }

        return result;
    }
}

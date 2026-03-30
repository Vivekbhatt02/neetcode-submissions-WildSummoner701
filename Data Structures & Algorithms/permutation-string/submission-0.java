class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0;i<s1.length();i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) +1);
        }
        Map<Character, Integer> secondMap = new HashMap<>();

        for(int i =0;i<s2.length();i++){
            secondMap.put(s2.charAt(i), secondMap.getOrDefault(s2.charAt(i), 0) +1);
            if(i >= s1.length()){
                char left = s2.charAt(i - s1.length());
                secondMap.put(left, secondMap.get(left) - 1);

                if(secondMap.get(left) == 0){
                    secondMap.remove(left);
                }
            }

            if(secondMap.equals(map)){
                return true;
            }

        }

        return false;
    }
}

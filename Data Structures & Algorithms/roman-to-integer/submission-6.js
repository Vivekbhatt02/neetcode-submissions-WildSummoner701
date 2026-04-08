class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    romanToInt(s) {
        const map = new Map();
        map.set("I",1);
        map.set("V",5);
        map.set("X",10);
        map.set("L",50);
        map.set("C",100);
        map.set("D",500);
        map.set("M",1000);

        let total = 0;

        for(let i=0;i<s.length;i++){
            if(i+1<s.length && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                total -= map.get(s.charAt(i));
            }else{
                total+=map.get(s.charAt(i));
            }
        }

        return total;
    }
}

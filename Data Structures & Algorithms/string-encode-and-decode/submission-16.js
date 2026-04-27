class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let result = '';
        for(let str of strs){
            result+=str.length;
            result+='#';
            result+=str;
        }

        return result;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        let i=0;
        let result = [];
        while(i<str.length){
           
            let j=i;
            while(str.charAt(j)!=="#"){
                j++;
            }
            
            let count = parseInt(str.substring(i, j));

            i=j+1;
            j=i+count;

            result.push(str.substring(i,j));
            i=j;
        }

        return result;
    }
}

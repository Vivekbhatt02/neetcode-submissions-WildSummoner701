class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let string = '';
        for(let str of strs){
            string+=str.length;
            string+='#';
            string+=str;
        }

        return string;
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
            while(str.charAt(j)!=='#'){
                j++;
            }
            let length = parseInt(str.substring(i,j));

            i=j+1;
            j=i+length;

            const word = str.substring(i,j);
            result.push(word);
            i=j;
        }

        return result;
    }
}

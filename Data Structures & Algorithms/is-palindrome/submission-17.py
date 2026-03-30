class Solution:
    def isPalindrome(self, s: str) -> bool:
        newString = ""
        filtered=""
        for ch in s:
            if ch.isalnum():
                filtered+=ch.lower()

        for i in range(len(filtered)-1,-1,-1):
                newString= newString+filtered[i]
        return newString ==filtered   
                   
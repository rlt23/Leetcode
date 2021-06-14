//409. Longest Palindrome
//Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!hs.contains(c)){
                hs.add(c);
            }else{
                hs.remove(c);
                count+=2;
            }
        }
        if(!hs.isEmpty()){
            count++;
        }
        return count;
    }
}
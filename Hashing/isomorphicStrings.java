//205. Isomorphic Strings

//Given two strings s and t, determine if they are isomorphic.
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while preserving the order of characters.
//No two characters may map to the same character, but a character may map to itself.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(smap.containsKey(sChar)){
                if(smap.get(sChar)!=tChar)return false;
            }else{
                smap.put(sChar,tChar);
            }
            
            if(tmap.containsKey(tChar)){
                if(tmap.get(tChar)!=sChar)return false;
            }else{
                tmap.put(tChar,sChar);
            }
        }
        return true;
    }
}
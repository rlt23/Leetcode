//20. Valid Parentheses
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:

// 1.Open brackets must be closed by the same type of brackets.
// 2.Open brackets must be closed in the correct order.

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(') st.push(')');
            else if(c == '{')st.push('}');
            else if(c == '[')st.push(']');
            else if(st.isEmpty() || c!=st.pop()) return false;
        }
        if(!st.isEmpty())return false;
        return true;
    }
}
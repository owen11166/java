package leetcode;

public class LongestCommonPrefix14 {

	public static void main(String[] args) {

	};

	public class Solution {
	    public String longestCommonPrefix(String[] strs) {
	        String res = "";
	        for (int i = 0; i < strs[0].length(); i++) {
	            for (String s : strs) {
	                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
	                    return res;
	                }
	            }
	            res += strs[0].charAt(i);
	        }
	        return res;
	    }
	}
}

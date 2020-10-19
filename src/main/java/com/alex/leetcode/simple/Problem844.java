package com.alex.leetcode.simple;

/**
 * 比较含退格的字符串
 * <p>
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 * <p>
 * 注意：如果对空文本输入退格字符，文本继续为空。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/backspace-string-compare
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author shenjg
 * @Date 2020/10/19 6:48 下午
 **/
public class Problem844 {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));

    }

    public static boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }
    
    public static String getString(String str) {
        StringBuilder sb = new StringBuilder();
        int deleteNum = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '#') {
                deleteNum += 1;
            } else {
                if (deleteNum > 0) {
                    deleteNum--;
                    continue;
                } else {
                    sb.insert(0, str.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}

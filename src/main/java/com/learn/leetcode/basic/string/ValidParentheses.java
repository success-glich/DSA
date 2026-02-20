package com.learn.leetcode.basic.string;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();

        char[] stack = new char[arr.length];
        int top = -1;

//        Stack<Character> stack = new Stack<>();


        for(int i=0;i<arr.length;i++){

            if(isOpenBracket(arr[i])){
//                stack.push(arr[i]);
                stack[top+1] = arr[i];
                top++;
            }else{

                if(top==-1){
                    return false;
                }else{
                    char topChar = stack[top];
                    top--;
                    if(!isValidPair(topChar,arr[i])){
                        return false;
                    }
                }

//                if(stack.isEmpty()){
//                    return false;
//                }else{
//                    char top = stack.pop();
//
//                    if(!isValidPair(top,arr[i])){
//                        return false;
//                    }
//                }
            }

        }
        return top==-1;
    }

    public boolean isOpenBracket(char c){
        return c=='(' ||c=='{'||c=='[';
    }

    public boolean isValidPair(char c1,char c2){

        return (c1=='(' && c2==')') || (c1=='{' && c2=='}') || (c1=='[' && c2==']');
    }
    public static void main(String[] args) {

        ValidParentheses obj = new ValidParentheses();
        solutelyTrue:System.out.println(obj.isValid("()[]{}"));
    }
}

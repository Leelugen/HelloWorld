package com.llg.LeetCode;

public class EvalRPN {

    public int evalRPN(String[] tokens) {
        Stack stack = new Stack();
        for (String str : tokens) {
            switch (str) {
                case "+": {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b + a);
                }
                break;
                case "-": {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                }
                break;
                case "*": {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b * a);
                }
                break;
                case "/": {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                }
                break;
                default:
                    stack.push(Integer.parseInt(str));
                    break;
            }
        }
        return stack.pop();
    }

    class Stack {
        private Node top;

        class Node {
            int data;
            Node next;
        }

        void push(int data) {
            Node node = new Node();
            node.data = data;
            if (top == null) {
                top = node;
            } else {
                node.next = top;
                top = node;
            }
            travers("push");
        }

        int pop() {
            if (top != null) {
                int data = top.data;
                Node temp = top.next;
                top = temp;
                travers("pop");
                return data;
            }
            return -1;
        }

        void travers(String str) {
            Node node = top;
            System.out.println(str);
            while (node != null) {
                System.out.print(node.data + "-");
                node = node.next;
            }
            System.out.println();
        }
    }

}

package com.llg.DataStructs.Tree;

public class Client {
    public static void main(String[] args) {
        ArrayTree tree = new ArrayTree(100);
        tree.addNode(0,-1,1);
        tree.addNode(0,0,2);
        tree.addNode(0,1,3);
        tree.addNode(1,0,4);
        tree.addNode(1,1,5);
        tree.addNode(5,0,8);
        tree.traverTree();
    }

}

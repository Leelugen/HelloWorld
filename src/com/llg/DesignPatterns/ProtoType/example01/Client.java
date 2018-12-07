package com.llg.DesignPatterns.ProtoType.example01;

public class Client {

    public static void main(String[] args) {
        //编辑原始文档
        WordDocument originDoc = new WordDocument();
        originDoc.setmText("this is my document");
        originDoc.addImages("图片1");
        originDoc.addImages("图片2");
        originDoc.addImages("图片3");
        originDoc.showDocument();

        //拷贝一份副本
        WordDocument newDoc = originDoc.clone();
        newDoc.showDocument();

        //修改文档副本 不会影响原始文档
        newDoc.setmText("这是修改过的newDoc 文本  ");

        //浅拷贝mImages 出现问题
        newDoc.addImages("hhhhhhhhhhhhhhhhh.jpg");


        newDoc.showDocument();
        originDoc.showDocument();
    }
}

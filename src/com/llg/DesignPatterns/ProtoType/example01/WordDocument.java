package com.llg.DesignPatterns.ProtoType.example01;

import java.util.ArrayList;

/**
 *原型模式
 */
public class WordDocument implements Cloneable {
    private String mText; //文本
    private ArrayList<String> mImages = new ArrayList<>();//图片名列表

    public WordDocument(){
        //对象拷贝时 不会执行构造方法
        System.out.println("================ wordDocument 构造函数===================");
    }

    @SuppressWarnings({"unchecked"})
    @Override
    protected WordDocument clone() {
        WordDocument doc = null;
        try {
            doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void addImages(String img) {
        this.mImages.add(img);
    }

    public void showDocument(){
        System.out.println("---------word doc start----------");
        System.out.println("Text:"+mText);
        System.out.println("images list:");
        for (String imgName:mImages) {
            System.out.println("image name:"+imgName);
        }
    }
}

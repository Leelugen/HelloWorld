package com.llg.DataStructs.Tree;


/**
 * 用数组表示一棵二叉树
 * 假定结点的数据为int 类型，利用数组的下标的关系，确定父子关系
 * 如：
 * int[] tree = new int{2,3,5,0,7,8,9,10}  0表示不存在
 * 于是tree数组表示这样的一棵树
 *          2
 *    3         5          i位置结点的左子树 = i*2+1   ***右** = i*2+2
 *   0      7      8     9
 * 0   0  10  0  0   0  0  0
 */
public class ArrayTree {
    private int[] mTree;
    private int mSize; //size

    public ArrayTree(int size) {
        mSize = size;
        mTree = new int[size];
    }

    /**
     * 根据索引返回结点
     * @param index
     * @return
     */
    public int getNode(int index) {
        if (!checkIndex(index)){
            throw new ArrayIndexOutOfBoundsException("over bounds");
        }
        return mTree[index];
    }

    /**添加结点
     * @param index
     * @param direction -1根 0 左，1 右
     * @param node
     * @return
     */
    public boolean addNode(int index,int direction, int node) {
        if (!checkIndex(index)){
            return false;
        }
        //根结点直接赋值
        if (direction == -1 && index == 0){
            mTree[0] = node;
            return true;
        }
        int addIndex = index*2+direction+1;
        if (!checkIndex(addIndex)){
            return false;
        }
        if (mTree[addIndex] != 0){
            return false;
        }
        mTree[addIndex] = node;
        return true;
    }

    /**
     * 删除某一个结点，意味着其子树也被将删除
     * @param index
     */
    public void deleteNode(int index){
        int i = index;
        while (checkIndex(i)){
            mTree[i] = 0; //先删除当前结点
            if (i != index){
                if (checkIndex(i+1)){
                    mTree[i+1] = 0;//删除右子结点
                }
            }
            i = i*2+1; //跳转到可能的左子结点
        }
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < mSize;
    }

    public void traverTree(){
        for (int i = 0,j=0;i<mSize;i++){
//            if (i+1 <= Math.pow(2,j)){ //换行
//                j++;
//                System.out.println();
//            }
            System.out.print(mTree[i]);
        }


    }

}

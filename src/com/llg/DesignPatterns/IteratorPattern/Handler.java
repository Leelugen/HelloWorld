package com.llg.DesignPatterns.IteratorPattern;

public abstract class Handler {
    protected Handler successor; //下一节点的处理者

    /**
     * 请求处理
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);
}

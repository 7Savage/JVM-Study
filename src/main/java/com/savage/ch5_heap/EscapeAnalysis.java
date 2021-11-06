package com.savage.ch5_heap;

/**
 * 逃逸分析
 *
 *
 */
public class EscapeAnalysis {


    public EscapeAnalysis obj;

    /*
    方法返回EscapeAnalysis对象，发生逃逸
     */
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /*
    为成员属性赋值，发生逃逸
     */
    public void setObj(){
        this.obj=new EscapeAnalysis();
    }
    //思考:如果当前的obj引用声明为static的？ 仍然会发生逃逸。

    /*
    对象的作用域仅在当前方法中有效，没有发生逃逸
     */
    public void useEscapeAnalysis(){
        EscapeAnalysis e = new EscapeAnalysis();
    }

    /*
    引用成员变量的值,发生逃逸
     */
    public void useEscapeAnalysis1(){
        EscapeAnalysis e = getInstance(); //这个e对象,本身就是从外面的方法逃逸进来的
        //getInstance().xxx()同样会发生逃逸
    }
}

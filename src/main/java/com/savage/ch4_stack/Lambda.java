package com.savage.ch4_stack;

@FunctionalInterface
interface Func{
    public boolean function();
}
public class Lambda {
    public void lambda(Func func){
        return;
    }
    public static void main(String[] args) {
        Func func=()->{
            return false;
        };
        Lambda lambda = new Lambda();
        lambda.lambda(func);

        lambda.lambda(new Func() {
            @Override
            public boolean function() {
                return true;
            }
        });
    }
}

package com.j4.testone.testone.bean;

public class MateriaMath implements OperationsMath{

    public MateriaMath(){

    }

    @Override
    public int sum(int a, int b) {
        return (a + b);
    }

    @Override
    public int rest(int a, int b) {
        return (a - b);
    }

    @Override
    public int multiplication(int a, int b) {
        return (a * b);
    }
}

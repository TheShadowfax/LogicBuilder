package com.ereinsure.operators;

import com.google.gson.Gson;

import java.util.ArrayList;

public abstract class Operator<T> {

    public String value;
    public  ArrayList<T> operands;
    public transient OperatorMetaData meta;
    public String as;

    public Operator(OperatorMetaData meta){
        this.meta = meta;
        this.operands = new ArrayList<T>();
    }

    public abstract Operator addOperand(T Operand) throws Exception;

    public Operator removeOperand(int index) throws Exception {
        if (index < 0 || index > this.operands.size() ) throw new Exception("Invalid index");
        this.operands.remove(index);
        return this;
    }

    public void setAlias(String alias){
        this.as = alias;
    }

    public void setValue(String value){
        this.value = value;
    }

    public  abstract T compute();
//    public static void main(String[] args) {
//        Operator op = new Operator(null) {
//            @Override
//            public Operator addOperand(Object Operand) {
//                 this.operands.add(Operand);
//                 return this;
//            }
//        };
//        Operator op1 = new Operator(null) {
//            @Override
//            public Operator addOperand(Object Operand) {
//                this.operands.add(Operand);
//                return this;
//            }
//        };
//        op.addOperand(op1);
//        Gson gson = new Gson();
//        String json = gson.toJson(op);
//        System.out.println(json);
//    }
}


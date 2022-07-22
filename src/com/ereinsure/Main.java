package com.ereinsure;

import com.ereinsure.operands.ConstantOperand;
import com.ereinsure.operators.AutoLoad;
import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.Operator;
import com.ereinsure.operators.arithmeticOperators.AddOperator;
import com.ereinsure.operators.arithmeticOperators.MultiplyOperator;
import com.ereinsure.parser.JSONFormat;
import com.ereinsure.parser.Parser;
import com.google.gson.Gson;
import org.reflections.Reflections;


public class Main {
    public static void main(String[] args) throws Exception {
        Parser parser = new Parser();
        Operator op;
        try {
            op = new AddOperator().addOperand(
                    new ConstantOperand(2, EOperatorInputTypes.NUMBER)
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Gson gson = new Gson();
        String json = gson.toJson(op);
        System.out.println(json);
        JSONFormat jsonFormat = gson.fromJson(json, JSONFormat.class);
        System.out.println(jsonFormat.toString());
        System.out.println(gson.toJson(parser.parse(jsonFormat)));
    }
}

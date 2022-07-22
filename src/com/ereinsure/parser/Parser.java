package com.ereinsure.parser;

import com.ereinsure.operands.ConstantOperand;
import com.ereinsure.operands.DynamicOperand;
import com.ereinsure.operators.AutoLoad;
import com.ereinsure.operators.EOperatorInputTypes;
import com.ereinsure.operators.Operator;
import com.ereinsure.operators.conditionalOperators.IfOperator;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.HashMap;

public class Parser<T> {
    private HashMap operatorMap = new HashMap<String, Class<?>>();

    public Parser(){
        try {
            this.init();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void init() throws InstantiationException, IllegalAccessException {
        Reflections ref = new Reflections("com.ereinsure.operators");
        for (Class<?> cl : ref.getTypesAnnotatedWith(AutoLoad.class)) {
            Operator obj = (Operator) cl.newInstance();
           operatorMap.put(obj.value,cl);
        }
        System.out.println(operatorMap.keySet());
    }

    public Object parse(JSONFormat json) throws Exception {
        Object value = json.getValue();
        if ( value instanceof String && this.operatorMap.containsKey(value)){
            Operator operator =( (Class<Operator>) this.operatorMap.get(value)).newInstance();
            JSONFormat[] operands = json.getOperands();
            if (operands != null && operands.length > 0){
                for(JSONFormat operand : operands){
                    if (value == "if"){
                        ((IfOperator)operator).addCondition(this.parse(operand));
                    } else {
                        operator.addOperand(this.parse(operand));
                    }
                }
            }
            if (value == "if") {
                if (json.get_then() != null){
                    ((IfOperator)operator).addThenLogic(this.parse(json.get_then()));
                }
                if (json.get_else() != null){
                    ((IfOperator)operator).addElseLogic(this.parse(json.get_else()));
                }
            }
            return operator;
        }

        if (json.getMeta().valueType == EOperatorInputTypes.NUMBER && value instanceof Number){
            if ((Double) value == Math.floor((Double) value) &&  !Double.isInfinite((Double) value)){
                value = ((Double) value).intValue();
            }
        }

        if (json.getMeta().type.toString().equals( "CONSTANT_OPERAND")){
            return new ConstantOperand(value,json.getMeta().valueType);
        }

        if (json.getMeta().type.toString().equals("DYNAMIC_OPERAND")){
            return new DynamicOperand(value,json.getMeta().valueType);
        }

        throw new Exception("Malformed Expression");
    }
}

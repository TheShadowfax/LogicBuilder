package com.ereinsure.operands;

import java.util.HashMap;
import java.util.Map;

public class DynamicOperandResolver<T> {
    private Map<String,T> dynamicOperandsMap;
    public DynamicOperandResolver(){
        this.dynamicOperandsMap = new HashMap<String,T>();
    }

    public void setNewDynamicOperand(String key,T value){
        this.dynamicOperandsMap.put(key,value);
    }

    public T getDynamicOperand(String key){
        return this.dynamicOperandsMap.get(key);
    }
}

package com.ereinsure.operands;

import java.util.HashMap;
import java.util.Map;

public class ReferenceOperandResolver<T> {
    private Map<String,T> referenceOperandsMap;
    public ReferenceOperandResolver(){
        this.referenceOperandsMap = new HashMap<String,T>();
    }

    public void setNewReferenceOperand(String key,T value){
        this.referenceOperandsMap.put(key,value);
    }

    public T getReferenceOperand(String key){
        return this.referenceOperandsMap.get(key);
    }
}

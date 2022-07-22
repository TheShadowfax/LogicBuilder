package com.ereinsure.parser;

import com.ereinsure.operands.OperandMetaData;

import java.util.Arrays;

public class JSONFormat<T> {
    private T value;

    private JSONFormat[] operands;
    private OperandMetaData meta;
    private JSONFormat _then;
    private JSONFormat _else;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public JSONFormat[] getOperands() {
        return operands;
    }

    public void setOperands(JSONFormat[] operands) {
        this.operands = operands;
    }

    public OperandMetaData getMeta() {
        return meta;
    }

    public void setMeta(OperandMetaData meta) {
        this.meta = meta;
    }

    public JSONFormat get_then() {
        return _then;
    }

    public void set_then(JSONFormat _then) {
        this._then = _then;
    }

    public JSONFormat get_else() {
        return _else;
    }

    public void set_else(JSONFormat _else) {
        this._else = _else;
    }

    @Override
    public String toString() {
        return "JSONFormat{" +
                "value=" + value +
                ", Operands=" + Arrays.toString(operands) +
                ", meta=" + meta +
                ", _then=" + _then +
                ", _else=" + _else +
                '}';
    }
}

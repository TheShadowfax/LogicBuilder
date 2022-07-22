package com.ereinsure.operators;

public enum EOperatorInputTypes {
    NUMBER("NUMBER"),
    STRING("STRING"),
    BOOLEAN("BOOLEAN"),
    INHERIT("INHERIT");

    private final String text;

    /**
     * @param text
     */
    EOperatorInputTypes(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }

}

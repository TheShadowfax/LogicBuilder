package com.ereinsure.tests;

import com.ereinsure.operands.*;
import com.ereinsure.operators.EOperatorInputTypes;
import org.junit.BeforeClass;

public class BaseTest {
    static DynamicOperandResolver dynamicOperandResolver;
    static   ReferenceOperandResolver referenceOperandResolver;

    @BeforeClass
    public static void init(){
        BaseTest.initDynamicOperands();
        BaseTest.initReferenceOperands();
    }

    private static void initDynamicOperands(){
        BaseTest.dynamicOperandResolver = new DynamicOperandResolver();
        BaseTest.dynamicOperandResolver.setNewDynamicOperand("PI",3.14);
    }

    private static  void initReferenceOperands(){
        BaseTest.referenceOperandResolver = new ReferenceOperandResolver();
        BaseTest.referenceOperandResolver.setNewReferenceOperand("RADIUS",7);
    }

    public ConstantOperand getNewConstantOperand(Object value, EOperatorInputTypes inputType) throws Exception {
        ConstantOperand constantOperand = new ConstantOperand(value,inputType);
        return constantOperand;
    }

    public DynamicOperand getNewDynamicOperand(Object value, EOperatorInputTypes valueType) throws Exception {
        DynamicOperand dynamicOperand = new DynamicOperand(value,valueType);
        dynamicOperand.setDynamicOperandResolver(this.dynamicOperandResolver);
        return  dynamicOperand;
    }

    public ReferenceOperand getNewReferenceOperand(Object value, EOperatorInputTypes valueType) throws Exception {
        ReferenceOperand referenceOperand = new ReferenceOperand(value,valueType);
        referenceOperand.setReferenceOperandResolver(this.referenceOperandResolver);
        return  referenceOperand;
    }
}

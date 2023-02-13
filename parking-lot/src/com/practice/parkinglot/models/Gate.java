package com.practice.parkinglot.models;

import com.practice.parkinglot.enums.GateType;

public abstract class Gate extends BaseModel{
    private int number;
    private GateType gateType;
    private Operator operator;
}

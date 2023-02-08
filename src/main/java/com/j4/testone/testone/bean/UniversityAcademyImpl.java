package com.j4.testone.testone.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class UniversityAcademyImpl implements UniversityAcademy{

    private OperationsMath operationsMath;

    public UniversityAcademyImpl(@Autowired OperationsMath operationsMath){
        this.operationsMath = operationsMath;
    }

    @Override
    public boolean helperOperationMath(int a, int b) {
        boolean evaluateNumber = false;
        switch (operationsMath.sum(a, b)){
            case 10:
                evaluateNumber = true;
                break;
            case 20:
                evaluateNumber = true;
            default:
                evaluateNumber = false;
        }
        return evaluateNumber;
    }
}

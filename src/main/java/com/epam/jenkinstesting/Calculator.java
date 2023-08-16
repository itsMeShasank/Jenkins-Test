package com.epam.jenkinstesting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

    public int addTwoNumbers(int num1,int num2) {
        log.info("addTwoNumbers method invoked");
        return num1+num2;
    }
    public int subtractTwoNumbers(int num1,int num2) {
        log.info("subtractTwoNumbers method invoked");
        return num1-num2;
    }

    public int multiplyTwoNumbers(int num1,int num2) {
        log.info("multiplyTwoNumbers method invoked");
        return num1 * num2;
    }
}

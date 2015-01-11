package com.github.vitineth.maths.functions.errors;

/**
 * Created by ryan on 10/01/15.
 */
public class BinomialCoefficientParameterException extends Exception {

    public BinomialCoefficientParameterException(){
        super("Cannot calculate a binomial coefficient when n > r > 0 is not true.");
    }

}

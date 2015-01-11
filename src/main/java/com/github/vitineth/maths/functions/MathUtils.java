package com.github.vitineth.maths.functions;

import com.github.vitineth.maths.functions.errors.BinomialCoefficientParameterException;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan on 11/01/2015.
 *
 * @author Ryan
 * @since 11/01/2015
 */
public class MathUtils {

    /**
     * This will calculate the given binomialCoefficient in the form of: <br>
     * <img src="http://mathforum.org/mathimages/imgUpload/math/7/2/2/72247a620629325bc76d310464f78286.png">
     *
     * @param n The value on top
     * @param k The value on the bottom
     * @return BigInteger - The answer
     * @throws BinomialCoefficientParameterException If the check n > k >= 0 fails
     */
    public static BigInteger solveBinomialCoefficients(int n, int k) throws BinomialCoefficientParameterException {
        // a > b > 0
        if (!(n > k) && !(k >= 0)) {
            throw new BinomialCoefficientParameterException();
        }
        BigInteger top = rEM(n);
        BigInteger base1 = rEM(k);
        BigInteger base2 = rEM(n - k);
        BigInteger base = base1.multiply(base2);

        return top.divide(base);
    }

    /**
     * Calculates r!<br><br>
     * <p/>
     * r! = 1x2x...r
     *
     * @param r The value to calculate
     * @return BigInteger - The result of r!
     */
    public static BigInteger rEM(int r) {
        BigInteger current = new BigInteger("1");
        for (int i = 1; i < r + 1; i++) {
            current = current.multiply(new BigInteger(i + ""));
        }
        return current;
    }

    /**
     * Generates all factors of the given value n
     *
     * @param n The number for which to calculate factors.
     * @return List[Integer] - The list of factors
     */
    public static List<Integer> generateFactorsOfN(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) factors.add(i);
        }
        return factors;
    }

}

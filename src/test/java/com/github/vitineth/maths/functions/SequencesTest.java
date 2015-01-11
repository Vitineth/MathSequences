package com.github.vitineth.maths.functions;

import java.awt.image.AreaAveragingScaleFilter;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by ryan on 10/01/15.
 */
public class SequencesTest {

    public static void main(String[] args){
//        long[] catalan = Sequences.generateCatalanNumbers(10);//http://oeis.org/A000108
//        BigInteger[] fibonacci = Sequences.generateFibonacciSequence(10);//http://oeis.org/A000045
//        long[] hexagonal = Sequences.generateHexagonalNumbers(10);//http://oeis.org/A000384
//        long[] caterers = Sequences.generateLazyCaterersNumbers(10);//http://oeis.org/A000124
//        long[] lookandsay = Sequences.generateLookAndSayNumbers(5);//http://oeis.org/A005150
//        long[] magicsquare = Sequences.generateMagicSquareNumbers(10);//http://oeis.org/A006003 - ?
//        long[] pentagonal = Sequences.generatePentagonalNumbers(10);//http://oeis.org/A000326
//        BigInteger[] recaman = Sequences.generateRecamánSequence(10);//http://oeis.org/A005132
//        long[] triangle = Sequences.generateTriangleNumbers(10);//http://oeis.org/A000217
//        long[] sigma1N = Sequences.generateSigma1N(10);//http://oeis.org/A000203
//        long[] sigma0N = Sequences.generateSigma0N(10);//http://oeis.org/A000005
//        long[] primes = Sequences.generatePrimesUpToN(10);
//        long[] tenPrimes = Sequences.generateNPrimes(10);
        long[] euler = Sequences.generateEulerTotientNumbers(10);
//
//        System.out.println("Catalan: " + Arrays.toString(catalan));
//        System.out.println("Fibonacci: " + Arrays.toString(fibonacci));
//        System.out.println("Hexagonal: " + Arrays.toString(hexagonal));
//        System.out.println("Caterers: " + Arrays.toString(caterers));
//        System.out.println("Look and say: " + Arrays.toString(lookandsay));
//        System.out.println("Magic Square: " + Arrays.toString(magicsquare));
//        System.out.println("Pentagonal: " + Arrays.toString(pentagonal));
//        System.out.println("Recaman: " + Arrays.toString(recaman));
//        System.out.println("Triangle: " + Arrays.toString(triangle));
//        System.out.println("Sigma1N: " + Arrays.toString(sigma1N));
//        System.out.println("Sigma0N: " + Arrays.toString(sigma0N));
//        System.out.println("Primes: " + Arrays.toString(primes));
//        System.out.println("NPrimes: " + Arrays.toString(tenPrimes));
        System.out.println("Euler: " + Arrays.toString(euler));
    }

}

/*
* program name :    Even Fibonacci sum // hackerRank // ProjectEuler // solved :)
* date         :    Mon Aug  7 23:55:47 IST 2017
*/

import java.util.*;
import java.io.*;
import java.math.*;

public class EvenFib {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int TestCases = Integer.parseInt(reader.readLine());
        while(TestCases-- > 0) {
            String limit = reader.readLine();
            BigInteger numberLimit = new BigInteger(limit);
            BigInteger sum = new BigInteger("10");
            BigInteger F_n = new BigInteger("34");
            BigInteger F_n_MinusThree = new BigInteger("8");
            BigInteger F_n_MinusSix = new BigInteger("2");
            while(F_n.compareTo(numberLimit) < 0) {
                BigInteger Four = F_n_MinusThree.multiply(new BigInteger("4"));
                F_n = Four.add(F_n_MinusSix);
                if(F_n.compareTo(numberLimit) < 0) {
                    sum = sum.add(F_n);
                }
                F_n_MinusSix = F_n_MinusThree;
                F_n_MinusThree = F_n;
                // System.out.println("F_n " + F_n);
                // System.out.println("F_n_MinusThree " + F_n_MinusThree);
                // System.out.println("F_n_MinusSix " + F_n_MinusSix);
                // System.out.println("sum " + sum);
            }
            System.out.println(sum);
        }
    }
}

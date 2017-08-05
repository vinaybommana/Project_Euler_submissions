/*
* program name :    Mutiples of 3 or 5 // hackerRank // ProjectEuler // solved :)
* date         :    Sat Aug  5 20:21:29 IST 2017
*/

import java.util.*;
import java.io.*;
import java.math.*;

public class MultiplesOf3Or5 {
    public static BigInteger sumOfFirstNnaturalNumbers(String N) {
        BigInteger n = new BigInteger(N);
        n = n.multiply(n.add(new BigInteger("1")));
        n = n.divide(new BigInteger("2"));
        return n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int TestCases = Integer.parseInt(reader.readLine());
        while(TestCases-- > 0) {
            int N = Integer.parseInt(reader.readLine());
            N--;
            Integer th = new Integer(N / 3);
            // System.out.println(th);
            Integer fi = new Integer(N / 5);
            Integer fif = new Integer(N / 15);
            BigInteger thBig = sumOfFirstNnaturalNumbers(th.toString());
            // System.out.println(thBig);
            thBig = thBig.multiply(new BigInteger("3"));
            BigInteger fiBig = sumOfFirstNnaturalNumbers(fi.toString());
            fiBig = fiBig.multiply(new BigInteger("5"));
            BigInteger fifBig = sumOfFirstNnaturalNumbers(fif.toString());
            fifBig = fifBig.multiply(new BigInteger("15"));

            BigInteger sum = new BigInteger("0");
            sum = sum.add(thBig);
            sum = sum.add(fiBig);
            sum = sum.subtract(fifBig);

            System.out.println(sum);
        }
    }
}

package com.ta.may;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HalloweenSale {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy

        int txCount = 0;
        int cost = p;
        if (p > s)
            return 0;
        while (cost > m) {
            s -= cost;
            cost = cost - d;
            txCount++;
            if (cost > s)
                return txCount;
        }
        cost = m;
        while (s >= m ) {
            s -= cost;
            txCount++;
            if (cost > s)
                return txCount;
        }

        return txCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(System.getenv("OUTPUT_PATH"))
        );

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        System.out.println(answer);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}



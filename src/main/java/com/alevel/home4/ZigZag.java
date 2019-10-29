package com.alevel.home4;

public class ZigZag {
    public String convert(String s, int numRows) {
        int interval = 2 * numRows - 2;
        char inputArr[] = s.toCharArray();
        if (numRows > inputArr.length) {
            return new String(s);
        }
        char[] result = new char[inputArr.length];
        int iter = 0;

        for (int i = 0; i < numRows; i++) {
            int step = interval - 2*i;
            for (int j = i; j < inputArr.length; j += interval) {
                result[iter] = inputArr[j];
                iter++;
                if (step > 0 && step < interval && j + step < inputArr.length) {
                    result[iter] = s.charAt(j + step);
                    iter++;
                }

            }
        }
        return new String(result);
    }
}

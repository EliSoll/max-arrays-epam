package com.epam.rd.autotasks.max;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMethod {
    public static int max(int[] values) {//throw new UnsupportedOperationException();
        int numMax = values[0];
        for (int num : values) {
            if (numMax < num){
                numMax = num;
            }
        }
        return numMax;
    }
}

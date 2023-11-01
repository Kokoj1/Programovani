package com.example.programovani;

import java.util.List;

public class MathUtils {
    public static double average (List<Integer> ave){
        double x = 0;
        for (int i = 0; i < ave.size(); i++) {
            x += ave.get(i);
        }
        return x/ave.size();
    }
}

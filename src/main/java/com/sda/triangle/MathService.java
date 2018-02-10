package com.sda.triangle;

import javax.ws.rs.QueryParam;

public class MathService {

    public Result getResult(int a, int b, int c) {
        double delta = (b * b) - 4 * a * c;
        double sqrt = Math.sqrt(delta);
        System.out.println(" a: " + a + " b: " + b + " c: " + c);

        if (delta < 0) {

            return null;
        }
        if (delta == 0) {
            double result = -b / 2 * a;
            return new Result(result, null);
        }
        if (delta > 0) {
            double first = -b + sqrt / 2 * a;
            double second = -b - sqrt / 2 * a;

            return new Result(first, second);
        }
        return null;
    }



    public Result fieldResult (int x, int h){

        double field = (x*h)/2;
        return new Result(field,null);

    }
}

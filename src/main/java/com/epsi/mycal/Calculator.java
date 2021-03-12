package com.epsi.mycal;

public class Calculator {
    public int add(int aa, int bb) {
        return aa + bb;
    }

    public int sub(int aa, int bb) {
        return aa - bb;
    }

    public int mul(int aa, int bb) {
        return aa * bb;
    }

    /** First Digit.
     * @param aa aa param.
     * @param bb bb param.
     * @return the division of aa and bb.
     */
    public double div(int aa, int bb) {
        double result = 0;
        try {
            result = (double)aa / (double)bb;
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    public boolean isPair(int aa) {
        return aa % 2 == 0;
    }

    /** FirstDigit.
     * @param aa aa param.
     * @return true if it's a first digit.
     */
    public boolean isFirstDigit(int aa) {
        boolean isPremier = true;
        if (aa < 0) {
            isPremier = false;
        } else if (aa != 0 && aa != 1) {
            for (int i = 2; i <= aa / 2; i++) {
                if (aa != i && aa % i == 0) {
                    isPremier = false;
                    break;
                }
            }
        }
        return isPremier;
    }
}

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

    public int div(int aa, int bb){
        return aa / bb;
    }

    public boolean isPair(int aa) {
        return aa % 2 == 0;
    }

    public boolean isFirstDigit(int aa) {
        boolean isPremier = true;
        if (aa < 0) {
            isPremier = false;
        } else if (aa != 0 && aa != 1) {
            for (int i = 2; i <= aa/2; i++) {
                if (aa != i && aa % i == 0) {
                    isPremier = false;
                    break;
                }
            }
        }
        return isPremier;
    }
}

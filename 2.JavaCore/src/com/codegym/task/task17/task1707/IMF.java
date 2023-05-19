package com.codegym.task.task17.task1707;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        IMF imf;
        synchronized (IMF.class){
             imf = new IMF();

        }
        return IMF.imf;

    }

    private IMF() {
    }
}

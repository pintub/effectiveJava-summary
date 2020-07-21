package com.sf.effectivejava.item11;

public class ManualHashCode {

    private int x;
    private String str;
    private long y;

    //TODO Cache hashCode as if ManualHashCode is immutable
    @Override
    public int hashCode() {
        int hasCode = Integer.hashCode(x);
        hasCode = 31 * hasCode + str.hashCode();
        hasCode = 31 * hasCode + Long.hashCode(y);
        return hasCode;
    }
}

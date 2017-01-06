package kik.KN.model;

import java.util.List;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
public class MSectionsTree {
    private int i;
    private String v;
    private String hS;
    private List<MSectionsTree> c;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String gethS() {
        return hS;
    }

    public void sethS(String hS) {
        this.hS = hS;
    }

    public List<MSectionsTree> getC() {
        return c;
    }

    public void setC(List<MSectionsTree> c) {
        this.c = c;
    }
}

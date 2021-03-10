package ru.alexmww;

import java.util.ArrayList;
import java.util.List;

public class MyUglyClass {
    public String a = "a";

    String f(List<String> a) {
        return "";
    }

    public void hh() {
        ArrayList<String> a = new ArrayList<String>();
        f(a);
        System.out.println(a);
    }
}

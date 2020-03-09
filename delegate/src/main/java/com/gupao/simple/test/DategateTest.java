package com.gupao.simple.test;

import com.gupao.simple.Boss;
import com.gupao.simple.Leader;

public class DategateTest {
    public static void main(String[] args) {
        new Boss().command("加密",new Leader());

    }
}

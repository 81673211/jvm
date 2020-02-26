package main.java;

import java.util.ArrayList;
import java.util.List;

public class OOMDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Demo> list = new ArrayList<>();
        while (true) {
            list.add(new Demo());
            Thread.sleep(5);
        }
    }

}

class Demo {}
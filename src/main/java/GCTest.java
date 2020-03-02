package main.java;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;

public class GCTest {

    public static void main(String[] args) {
        for (GarbageCollectorMXBean mxBean : ManagementFactory.getGarbageCollectorMXBeans()) {
            System.out.println(mxBean.getName());
        }
    }
}

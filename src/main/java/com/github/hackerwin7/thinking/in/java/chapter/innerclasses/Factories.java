package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;
import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/03
 * Time: 3:46 PM
 * Desc:
 * Tips:
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    private Implementation1() {}
    public void method1() { print("Implementation1 method1"); }
    public void method2() { print("Implementation1 method2"); }
    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service {
    private Implementation2() {}
    public void method1() { print("Implementation2 method1"); }
    public void method2() { print("Implementation2 method2"); }
    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation2();
        }
    };
}
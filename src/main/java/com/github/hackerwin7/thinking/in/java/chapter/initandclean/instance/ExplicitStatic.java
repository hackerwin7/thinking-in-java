package com.github.hackerwin7.thinking.in.java.chapter.initandclean.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/21
 * Time: 11:39 AM
 * Desc: if there is no access to the class, then the static domain of class would not init
 * Tips:
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        //Cups.cup1.f(99);
    }
    //static Cups cups1 = new Cups();
    //static Cups cups2 = new Cups();
}

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}
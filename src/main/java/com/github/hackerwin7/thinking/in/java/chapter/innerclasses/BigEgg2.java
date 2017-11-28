package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;
import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/11
 * Time: 4:31 PM
 * Desc:
 * Tips:
 */
public class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() { print("BigEgg2.Yolk()"); }
        public void f() { print("BigEgg2.Yolk.f()"); }
    }
    public BigEgg2() { insertYolk(new Yolk()); }
    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}

class Egg2 {
    protected class Yolk {
        public Yolk() { print("Egg2.Yolk()"); }
        public void f() { print("Egg2.Yolk.f()"); }
    }
    private Yolk y = new Yolk();
    public Egg2() { print("new Egg2()"); }
    public void insertYolk(Yolk yy) { y = yy; }
    public void g() { y.f(); }
}
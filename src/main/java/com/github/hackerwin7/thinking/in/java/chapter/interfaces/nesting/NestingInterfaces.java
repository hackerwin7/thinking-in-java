package com.github.hackerwin7.thinking.in.java.chapter.interfaces.nesting;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/03/06
 * Time: 7:02 PM
 * Desc:
 * Tips:
 */
public class NestingInterfaces {
    public class BImp implements A.B {
        public void f() {}
    }

    class CImp implements A.C {
        public void f() {}
    }

//    class DImp implements A.D {
//        public void f() {}
//    }

    class EImp implements E {
        public void g() {}
    }

    class EGImp implements E.G {
        public void f() {}
    }

    class EImp2 implements E {
        public void g() {}
        class EG implements G {
            public void f() {}
        }
    }

    public static void main(String[] args) {
        A a = new A();
//   !     A.D ad = a.getD(); // private interface D, can not access
//   !     A.DImp2 di2 = a.getD(); // implements private interface can only be used itself
//   !     a.getD().f(); // private interface D
        A a2 = new A();
        a2.receiveD(a.getD());

        a.getF().f();
    }
}

class A {
    interface B {
        void f();
    }

    public class BImp implements B {
        public void f() {}
    }

    private class BImp2 implements B {
        public void f() {}
    }

    public interface C {
        void f();
    }

    class CImp implements C {
        public void f() {}
    }

    private class CImp2 implements C {
        public void f() {}
    }

    private interface D {
        void f();
    }

    private class DImp implements D {
        public void f() {}
    }

    public class DImp2 implements D {
        public void f() {}
    }

    public D getD() { return new DImp2(); }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }

    public interface F {
        void f();
    }

    private class FImp implements F {
        public void f() {}
    }

    public class FImp2 implements F {
        public void f() {}
    }

    public F getF() { return new FImp2(); }

    private F fRef;

    public void receiveF(F f) {
        fRef = f;
        f.f();
    }
}

interface E {
    interface G {
        void f();
    }

    public interface H {
        void f();
    }

    void g();
}
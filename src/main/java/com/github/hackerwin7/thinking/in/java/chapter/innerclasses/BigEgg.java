package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;
import static com.github.hackerwin7.thinking.in.java.utils.Print.*;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/11
 * Time: 4:27 PM
 * Desc:
 * Tips:
 */
public class BigEgg extends Egg {
    public class Yolk {
        public Yolk() { print("BigEgg.Yolk()"); }
    }
    public static void main(String[] args) {
        new BigEgg();
    }
}

class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() { print("Egg.Yolk()"); }
    }
    public Egg() {
        print("New Egg()");
        y = new Yolk();
    }
}
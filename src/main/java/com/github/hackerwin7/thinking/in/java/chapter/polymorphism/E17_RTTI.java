package com.github.hackerwin7.thinking.in.java.chapter.polymorphism;

import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle.Cycle;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle.Tricycle;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle3.Bicycle;
import com.github.hackerwin7.thinking.in.java.chapter.polymorphism.cycle3.Unicycle;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/02/21
 * Time: 9:02 PM
 * Desc:
 * Tips:
 */
public class E17_RTTI {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[] {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        //! cycles[0].balance();
        //! cycles[1].balance();
        //! cycles[2].balance();
        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
        ((Unicycle) cycles[2]).balance();
    }
}

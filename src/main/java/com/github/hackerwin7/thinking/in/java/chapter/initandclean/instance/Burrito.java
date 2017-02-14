package com.github.hackerwin7.thinking.in.java.chapter.initandclean.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/11/21
 * Time: 4:46 PM
 * Desc: multiple class single type
 * Tips:
 */
public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.print("This burrito is ");
        switch (degree) {
            case NOT:       System.out.println("not spicy at all"); break;
            case MILD:
            case MEDIUM:    System.out.println("a little hot"); break;
            case HOT:
            case FLAMING:
            default:        System.out.println("maybe too hot");
        }
    }

    public static void main(String[] args) {
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}

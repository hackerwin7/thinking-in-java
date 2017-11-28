package com.github.hackerwin7.thinking.in.java.chapter.innerclasses;
/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/03
 * Time: 3:16 PM
 * Desc:
 * Tips:
 */
public class E14_HorrorShow2 {
    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster() {
            public void destroy() {

            }

            public void menace() {

            }
        };
        HorrorShow.u(barney);
        HorrorShow.v(barney);
        Vampire vlad = new Vampire() {
            public void drinkBlood() {

            }

            public void destroy() {

            }

            public void kill() {

            }

            public void menace() {

            }
        };
        HorrorShow.u(vlad);
        HorrorShow.v(vlad);
        HorrorShow.w(vlad);
    }
}
package com.github.hackerwin7.thinking.in.java.chapter.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2017/07/20
 * Time: 3:48 PM
 * Desc:
 * Tips:
 */
public class AsListInterface {
    public static void main(String[] args) {
        // wont compile Light and Heavy which extends Powder
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(), new Powder()
        );
//        List<Snow> snow2 = Arrays.asList(
//                new Light(), new Heavy()
//        );
        // implicit type would only see the one level inherit relationship

        // Collections.addAll can add Light and Heavy
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        // explicit type
        List<Snow> snow4 = Arrays.<Snow>asList(
                new Light(), new Heavy()
        );
    }
}

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}
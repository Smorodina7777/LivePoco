package org.example;

import org.example.bean.Bird;
import org.example.bean.Bug;
import org.example.bean.Leaf;
import org.example.bean.Leopard;
import org.example.bean.Mangust;
import org.example.bean.Snake;
import org.example.bean.Spider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LifeTest {

    private Leaf leaf;

    @Before
    public void init() {
        leaf = new Leaf(new Bug(new Bird(new Spider(new Snake(new Mangust(new Leopard()))))));
    }

    @Test
    public void testLife() {
        String s = leaf.toString();
        System.out.println(s);
        Assert.assertEquals("Листик съел жучок,жучка съела птичка,птичку съел паук,паука съела змея," +
                        "змею съел мангуст,мангуста съел леопард,леопард живёт - поживает!", s);
    }
}

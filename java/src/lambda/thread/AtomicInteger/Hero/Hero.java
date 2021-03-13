package src.lambda.thread.AtomicInteger.Hero;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Kayleh
 * @Date: 2020/11/25 23:57
 */
public class Hero
{
    public String name;
    public AtomicInteger hp = new AtomicInteger();
    public int damage;

    public void recover()
    {
        hp.incrementAndGet();
    }

    public void hurt()
    {
        hp.decrementAndGet();
    }

    public void attackHero(Hero h)
    {
        h.hp.addAndGet(0 - damage);
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
        if (h.isDead())
            System.out.println(h.name + "死了！");
    }

    public boolean isDead()
    {
        return 0 >= hp.intValue() ? true : false;
    }
}

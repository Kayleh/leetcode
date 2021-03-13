package src.lambda.thread.runable;

import src.lambda.Hero;

/**
 * @Author: Kayleh
 * @Date: 2020/11/20 0:00
 */
public class Battle implements Runnable
{

    private Hero h1;
    private Hero h2;

    public Battle(Hero h1, Hero h2)
    {
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public void run()
    {
        while (!h2.isDead())
        {
            h2.attackHero(h1);
        }
    }
}

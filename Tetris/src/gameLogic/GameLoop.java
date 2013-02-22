/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameLogic;

/**
 *
 * @author SampaX
 */

public abstract class GameLoop
{
    private boolean running = false;
 

    public void run(double timeStep)
    {
        running = true;
         
        startup();
        double nextTime = (double)System.nanoTime() / 1000000000.0;
        double maxTimeDiff = 0.5;
        int skippedFrames = 1;
        int maxSkippedFrames = 5;
        while(running)
        {

            double currentTime = (double)System.nanoTime() / 1000000000.0;
            if((currentTime - nextTime) > maxTimeDiff) nextTime = currentTime;
            if(currentTime >= nextTime)
            {
                
                nextTime += timeStep;
                update();
                if((currentTime < nextTime) || (skippedFrames > maxSkippedFrames))
                {
                    draw();
                    skippedFrames = 1;
                }
                else
                {
                    skippedFrames++;
                }
            }
            else
            {
                int sleepTime = (int)(1000.0 * (nextTime - currentTime));
                if(sleepTime > 0)
                {
                    try
                    {
                        Thread.sleep(sleepTime);
                    }
                    catch(InterruptedException e)
                    {
                    }
                }
            }
        }
        shutdown();
    }
 
    public void stop()
    {
        running = false;
    }
 
    public abstract void startup();
    public abstract void shutdown();
    public abstract void update();
    public abstract void draw();
}

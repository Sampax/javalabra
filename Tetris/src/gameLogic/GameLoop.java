
package gameLogic;

/**
 *
 * @author SampaX
 */

public abstract class GameLoop
{
    private boolean running = false;
 

    /**
     * Determines the passing of in-game time, essentially the game lives in the loop for its duration
     * @param timeStep the amount of time in seconds between gametime updates
     */
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
 
    /**
     * stops the execution of the gameLoop
     */
    public void stop()
    {
        running = false;
    }

    /**
     * abstract method to be implemented by the main class to start the game
     */
    public abstract void startup();
    
    /**
     * abstract method to be implemented by the main class to shut the game down
     */
    public abstract void shutdown();
    
    /**
     * abstract method to be implemented by the main class to update the gamestate
     */
    public abstract void update();
    
    /**
     * abstract method to be implemented by the main class to draw graphics
     */
    public abstract void draw();
}

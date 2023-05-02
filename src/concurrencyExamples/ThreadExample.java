package concurrencyExamples;

import java.util.ArrayList;
import java.util.List;

class Design {
    private int code;
    private String name;
    private List<Long> votes;

    public Design(int code, String name) {
        this.code = code;
        this.name = name;
        this.votes = new ArrayList<Long>();
    }

    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }

    public List<Long> getVotes() {
        return votes;
    }
}

class VotingRunnable  implements Runnable{ // Ch02-Step 1 - Implement class by the Runnable interface

    private Design d;
    protected boolean doStop = false; // Will be used in chapter 3 challenge

    public VotingRunnable(Design d) {
        this.d = d;
    }

    // Ch02-Step 2 - Override the run() method
    @Override
   	public void run() {
    	while(!doStop) {
            //Ch03-Step 4 - Surround the code in a while loop
            System.out.println("Voting going on for design " + d.getName());
            d.getVotes().add(1L);

            /* Ch03-Step 1 - Generate a random number
               To generate a random number between 0 & 1000 - consider using: Math.random() * 1000
            */
            // Ch03-Step 2 - Pause the thread for this random amount of time
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
   		
   	}
}

class CountingRunnable implements Runnable{ // Ch02-Step 3 - Implement class by the Runnable interface

    private Design d;
    protected boolean doStop = false; // Will be used in chapter 3 challenge

    public CountingRunnable(Design d) {
        this.d = d;
    }
    
    // Ch02-Step 4 - Override the run() method
    @Override
	public void run() {
    	//Ch03-Step 5 - Surround the code in a while loop
        while(!doStop) {
            System.out.println("Design " + d.getName() + " has " + d.getVotes().size() + " votes");
            //Ch03-Step 3 - Pause the thread for 2 seconds
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		Design d1 = new Design(1,"D1");
        VotingRunnable votingRunnableD1 = new VotingRunnable(d1);
        CountingRunnable countingRunnableD1 = new CountingRunnable(d1);

        Thread votingD1 = new Thread(votingRunnableD1);
        Thread countingD1 = new Thread(countingRunnableD1);

        votingD1.start();
        countingD1.start();

        Design d2 = new Design(2,"D2");
        VotingRunnable votingRunnableD2 = new VotingRunnable(d2);
        CountingRunnable countingRunnableD2 = new CountingRunnable(d2);

        Thread votingD2 = new Thread(votingRunnableD2);
        Thread countingD2 = new Thread(countingRunnableD2);

        votingD2.start();
        countingD2.start();

        Design d3 = new Design(3,"D3");
        VotingRunnable votingRunnableD3 = new VotingRunnable(d3);
        CountingRunnable countingRunnableD3 = new CountingRunnable(d3);

        Thread votingD3 = new Thread(votingRunnableD3);
        Thread countingD3 = new Thread(countingRunnableD3);

        votingD3.start();
        countingD3.start();

        // Ch03-Step 6 - Pause the main thread for 30 seconds
        try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


        /* Ch03-Step 7 - At the end of 30 seconds all threads should be stopped.
           Set the doStop flag in runnables to do this */
        votingRunnableD1.doStop = true;
        votingRunnableD2.doStop = true;
        votingRunnableD3.doStop = true;
        countingRunnableD1.doStop = true;
        countingRunnableD2.doStop = true;
        countingRunnableD3.doStop = true;
        


        // Ch03-Step 8 - Uncomment these print statements to print the total votes obtained by the 3 designs
        System.out.println("Voting has stopped for design " + d1.getName());
        System.out.println("Total votes for " + d1.getName() + ": " + d1.getVotes().size());
        System.out.println("Voting has stopped for design " + d2.getName());
        System.out.println("Total votes for " + d2.getName() + ": " + d2.getVotes().size());
        System.out.println("Voting has stopped for design " + d3.getName());
        System.out.println("Total votes for " + d3.getName() + ": " + d3.getVotes().size());
    }

}




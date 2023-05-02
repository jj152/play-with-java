package concurrencyExamples;

/* The only difference with ThreadJoinExample02 - doesn't use anonymous class and lambda expression for thread creation */

public class ThreadJoinExample01 {

	public static void main(String[] args) {
		int[] marks = new int[10];
        Thread marksThread = new Thread(new Marks(marks));
        Thread avgThread = new Thread(new Average(marks));
        marksThread.start();
        System.out.println(marksThread.getName()+ " "+ marksThread.getPriority()+ " " + marksThread.getState());
        System.out.println(Thread.currentThread().getName()+ " "+ Thread.currentThread().getPriority()+ " " + Thread.currentThread().getState());
        System.out.println(avgThread.getName()+ " "+ avgThread.getPriority()+ " " + avgThread.getState());
        try {
			marksThread.join(); // The main thread will join once the marksThread's execution is done.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        avgThread.start();
	}

}

class Marks implements Runnable {
    int[] marks;
    public Marks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public void run() {
        for(int i = 0; i<5; i++) {
            Double points = Math.random() * 10;
            marks[i] = points.intValue();
            System.out.println("Mark entered: " + marks[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Average implements Runnable {
    int[] marks;
    public Average(int[] marks) {
        this.marks = marks;
    }

    @Override
    public void run() {
        float sum = 0;
        int count = 0;
        for(int i = 0; i<5; i++) {
            sum = sum + marks[i];
            count++;
        }

        System.out.println("Average " + sum/count);
    }
}


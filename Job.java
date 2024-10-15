public class Job implements Runnable {
    private int jobNumber;

    // Constructor
    Job(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    // The run method where the job's work is performed
    @Override
    public void run() {
        // Emulate some work by sleeping for a period
        System.out.println("Job: " + jobNumber + " is being processed by thread: "
                           + Thread.currentThread().getName());
        try {
            // Sleep for 1 second (1000 milliseconds)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // No handling as example should not experience interruptions
        }
        System.out.println("Job: " + jobNumber + " is ending in thread: "
                           + Thread.currentThread().getName());
    }
}

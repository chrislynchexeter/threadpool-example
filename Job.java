/**
 * The Job class implements the Runnable interface and simulates a job that
 * can be processed by a thread.
 */
public class Job implements Runnable {
    private int jobNumber;

    /**
     * Constructor to create a new Job instance.
     * @param jobNumber The number assigned to this job.
     */
    Job(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    /**
     * This method simulates the work of the job by having the thread
     * sleep for a period.
     */
    @Override
    public void run() {
        System.out.println("Job: " + jobNumber + " is being processed by thread: "
                           + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);  // Simulate some work by sleeping for 1 second
        } catch (InterruptedException e) {
            // No handling required in this example
        }
        System.out.println("Job: " + jobNumber + " is ending in thread: "
                           + Thread.currentThread().getName());
    }
}

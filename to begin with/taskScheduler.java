import java.time.LocalTime;

// The 'Executors' package is used to initiates and controles the execution of threads
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskScheduler{
	// newSingleThreadScheduledExecutor() creates an executor with a single thread that will never do anything
	// in parallel to the existing thread. It has just one, and threads can't execute more than 1 thing at a time
	private final ScheduledExecutorService schedulerExecutorService = Executors.newSingleThreadScheduledExecutor();

	// InterruptedExecution is thrown when a thread is interrupted while it'a waiting, sleeping, or otherwise occupied
	public static void main(String args{}) throws InterruptedException{
		var taskScheduler = new TaskScheduler();
		taskScheduler.printCurrentTimeEvery2Seconds();
		// Lesser the time thread sleeps, lesser the time is displayed
		Thread.sleep(15000);
		taskScheduler.stopPrinting();
	}

	public void printCurrentTimeEvery2Seconds(){
		Runnable task = () -> System.out.println(LocalTime.now());
		// The task is fixed so that it repeats itself after fixed number of times, 
		// refer scheduleAtFixedRate vs scheduleWithFixedDelay, in stackoverflow
		scheduledExecutorService.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
	}

	public void stopPrinting(){
		// Stops / breaks the execution of the thread
		scheduledExecutorService.shutdown();
	}

} 


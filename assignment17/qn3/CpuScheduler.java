package assignment17.qn3;

import java.util.LinkedList;
import java.util.Queue;

public class CpuScheduler {
	Queue<Job> queue = new LinkedList<>();
	int currentTime;
	int trackingWaitingTime;
	int turnaroundTime;
	int totalProceedJob;

	public CpuScheduler() {
		currentTime = 0;
		trackingWaitingTime = 0;
		turnaroundTime = 0;
		totalProceedJob = 0;
	}

	public void addJob(Job job) {
		queue.add(job);
	}

	public void processJobs() {
		while (!queue.isEmpty()) {
			Job currentJob = queue.poll();
			trackingWaitingTime = trackingWaitingTime + currentTime;
			turnaroundTime = turnaroundTime + currentJob.getProcessing_time();
			currentTime = currentTime + currentJob.getProcessing_time();
			totalProceedJob++;
		}
	}

	public double averageTrackingWaitingTime() {
		return trackingWaitingTime / totalProceedJob;
	}

	public double averageTurnaroundTime() {
		return turnaroundTime / totalProceedJob;
	}

}

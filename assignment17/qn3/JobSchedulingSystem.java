package assignment17.qn3;

import java.util.Scanner;

public class JobSchedulingSystem {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        CpuScheduler cpu=new CpuScheduler();

        System.out.println("Enter number of jobs:");
        int x=sc.nextInt();

        System.out.println("Enter jobs:");
        for(int i=0;i<x;i++) 
        cpu.addJob(new Job(sc.nextInt()));

        cpu.processJobs();

        System.out.println("Average waiting Time:"+cpu.averageTrackingWaitingTime());
        System.out.println("Average Turnaround Time:"+cpu.averageTurnaroundTime());

    }
}

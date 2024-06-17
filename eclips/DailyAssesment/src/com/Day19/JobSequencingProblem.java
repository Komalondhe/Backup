package com.Day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Job{
	int Id;
	int DeadLine;
	int Profit;
	Job(int id,int deadline,int profit){
		this.Id=id;
		this.DeadLine=deadline;
		this.Profit=profit;
	}
	@Override
	public String toString()
	{
		return "Job{"+"Id="+Id+"DeadLine="+DeadLine+"Profit="+Profit+'}';
		
	}
}

public class JobSequencingProblem {
	public static List<Job>JobSequencing(List<Job>jobs){
		jobs.sort((a,b) ->b.Profit - a.Profit);
		int maxDeadLine=jobs.stream().mapToInt(job ->job.DeadLine).max().orElse(0);
		Job[]resultJobs=new Job[maxDeadLine];
		boolean[]slot=new boolean[maxDeadLine];
		for(Job job:jobs) {
			for(int j =Math.min(maxDeadLine-1, job.DeadLine-1);j>=0;j--) {
				if(!slot[j]) {
					slot[j]=true;
					resultJobs[j]=job;
					break;
					
				}
			}
			
		}
		List<Job>scheduleJobs=new ArrayList<>();
		for(Job job:resultJobs) {
			if(job!=null) {
				scheduleJobs.add(job);
			}
		}
		return scheduleJobs;
	}

	public static void main(String[] args) {
		List<Job>jobs=Arrays.asList(
				new Job(1, 4, 20) ,
				new Job(2, 1, 10) ,
				new Job(3, 1, 40) ,
				new Job(4, 1, 30) 
				);
		List<Job>jobSequenceJobs=JobSequencing(jobs);
		System.out.println("The Maximum profit sequence of jobs is:");
		for(Job job:jobSequenceJobs) {
			System.out.println(job);
		}

	}

}

package MyPack;

import java.util.Iterator;
import java.util.List;

public class Jobs {

	private int srNo;
	private String jobType;
	private List<String> jobs;
	
	public Jobs() {
		super();
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public List<String> getJobs() {
		return jobs;
	}

	public void setJobs(List<String> jobs) {
		this.jobs = jobs;
	}
	
    public void JobInfo(){
    	
    	System.out.println(srNo+" "+jobType);
    	System.out.println("Available Jobs...");
    	
    	Iterator<String> itr = jobs.iterator();
    	while(itr.hasNext()){
    		
    		System.out.println(itr.next());
    	}
    }
}

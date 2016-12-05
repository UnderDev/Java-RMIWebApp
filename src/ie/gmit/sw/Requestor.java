package ie.gmit.sw;

public class Requestor {
	private String algo;
	private String s;
	private String t;
	private String taskNum;

	public Requestor() {
		super();
	}

	public Requestor(String algorithm, String s1, String t1, String taskNumber) {
		this.algo = algorithm;
		this.s = s1;
		this.t= t1;
		this.taskNum = taskNumber;

	}

	public String getAlgo() {
		return algo;
	}

	public void setAlgo(String algo) {
		this.algo = algo;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getTaskNum() {
		return taskNum;
	}

	public void setTaskNum(String taskNum) {
		this.taskNum = taskNum;
	}

}

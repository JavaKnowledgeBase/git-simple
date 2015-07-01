package is.it.simple;

public class YesItIs {
	
	private String howIsThat;
	
	private String didFromGit;
	
	private String testSec;

	public String getHowIsThat() {
		if(howIsThat.isEmpty()){
			return "I Dont Know";
		}
		return howIsThat;
	}

	public void setHowIsThat(String howIsThat) {
		this.howIsThat = howIsThat;
	}

	public String getDidFromGit() {
		return didFromGit;
	}

	public void setDidFromGit(String didFromGit) {
		this.didFromGit = didFromGit;
	}

	public String getTestSec() {
		return testSec;
	}

	public void setTestSec(String testSec) {
		this.testSec = testSec;
	}
	
	

}

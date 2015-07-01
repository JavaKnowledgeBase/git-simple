package is.it.simple;

public class YesItIs {
	
	private String howIsThat;

	public String getHowIsThat() {
		if(howIsThat.isEmpty()){
			return "I Dont Know";
		}
		return howIsThat;
	}

	public void setHowIsThat(String howIsThat) {
		this.howIsThat = howIsThat;
	}

}

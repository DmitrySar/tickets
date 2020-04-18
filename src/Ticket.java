public class Ticket {
	
	private int number;
	private String url;

	public Ticket(int number, String url) {
		this.number = number;
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
	
	public int getNumber() {
		return number;
	}
	
}

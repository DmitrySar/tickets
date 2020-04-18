public class Student {
	
	private String name;
	private int group;
	private Ticket ticket;

	public Student(String name, int group) {
		this.name = name;
		this.group = group;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public int getGroup() {
		return group;
	}

	public String getName() {
		return name;
	}
	
}


import java.util.*;

public class Distributor {
	
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Ticket> tickets = new ArrayList<>();

	public Distributor(ArrayList<Student> students, ArrayList<Ticket> tickets) {
		this.students = students;
		this.tickets = tickets;
	}
	
	public ArrayList<Student> getStudentsWithTickets() {
		ArrayList<Integer> numberTickets = new ArrayList<>();
		for (int i = 0; i < tickets.size(); i++) {
			numberTickets.add(i);
		}
		ArrayList<Student> studentsWithTickets = students;
		for (int i = 0; i < students.size(); i++) {
			int c = new Random().nextInt(numberTickets.size());
			studentsWithTickets.get(i).setTicket(tickets.get(numberTickets.get(c)));
			numberTickets.remove(c);
		}
		return studentsWithTickets;
	}
}

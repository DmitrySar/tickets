import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		ArrayList<Ticket> tickets = new ArrayList<>();
		students.add(new Student("иванов иван иванович", 303));
		students.add(new Student("петров петр петрович", 303));
		students.add(new Student("сидоров сидор сидорович", 306));
		students.add(new Student("feefdfdf gfrrrgr rgrgrg", 303));
		tickets.add(new Ticket(1, "link 1"));
		tickets.add(new Ticket(2, "link 2"));
		tickets.add(new Ticket(3, "link 3"));
		tickets.add(new Ticket(4, "link 4"));
		Distributor distributor = new Distributor(students, tickets);
		for (Student s: distributor.getStudentsWithTickets()) {
			String line = String.format("%s\tбилет N%s\t%s",
										s.getName(), 
										s.getTicket().getNumber(), 
										s.getTicket().getUrl());
			System.out.println(line);
		}
	}
}

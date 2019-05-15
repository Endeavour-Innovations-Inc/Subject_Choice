import java.util.ArrayList;
import java.util.Random;

public class Subject_choice {
	public static void main(String[] args) {
	Random random = new Random();
	Random randomx = new Random();
	ArrayList<String> subjects = new ArrayList<String>();
	subjects.add("Calc II");
	subjects.add("Diff Equations");
	subjects.add("Physics");
	int choice = random.nextInt(3);
	String subject_choose = subjects.get(choice);
	ArrayList<Integer> time_interval = new ArrayList<Integer>();
	time_interval.add(10);
	time_interval.add(20);
	time_interval.add(30);
	int tchoice = randomx.nextInt(3);
	int tchoice_b = randomx.nextInt(3);
	int xtime = time_interval.get(tchoice);
	int xtime_b = time_interval.get(tchoice_b);

	System.out.println("Right now I will do " + subject_choose + " "
			+ "and i will do it for " + xtime + " minutes with a break time of "
					+ xtime_b + " minutes");
	}

}

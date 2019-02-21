import javax.swing.JOptionPane;

public class the_riddler {
public static void main(String[] args) {
	
	int score = 0;
	for(int i= 0; i < 5; i++) {
	String riddle_one = JOptionPane.showInputDialog("I am tall when i am young and short when im old, what im I");
	String riddle_two = JOptionPane.showInputDialog(" jjnjbjbjb ");
			if(riddle_one.equals("candle")) { 
				System.out.println("your right");
				score++;
			}
			else  {
				System.out.println("your wrong");
				score--;
			}
			
			
}
	System.out.println("score =" + score);
} 
}

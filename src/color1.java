import javax.swing.JOptionPane;

public class color1 {

	public static void main(String[] args) {
		String favorite = JOptionPane.showInputDialog("what is your favorite color");
		if (favorite.equals("red")){
			System.out.println("you are cool");
		}

		else {
			System.out.println("you are a loser");
		}
}
}
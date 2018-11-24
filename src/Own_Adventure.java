import javax.swing.JOptionPane;

public class Own_Adventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"welcome to your own adventure, the instruction are: I tell you the story and all you do is choose the plot of the story");
		int charecter = JOptionPane.showOptionDialog(null, "once apon a time there lived a...",
				"who would you like him to meet", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { " llama", " human" }, null);
		if (charecter == 1) {
			JOptionPane.showInputDialog(null, "the human died the end");
		}
		if (charecter == 0) {
			JOptionPane.showInputDialog(null, "the llama also died the end");
		}
	}
}

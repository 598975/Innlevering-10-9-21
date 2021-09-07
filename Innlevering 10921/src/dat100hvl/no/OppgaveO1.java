package dat100hvl.no;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		String biTxt = showInputDialog("Bruttoinntekt i kr: ");
		double bi = parseInt(biTxt);
		double ts = 0;
		
		if(bi <= 164100)
		{
		} else if(bi <= 230950) {
			ts = bi * 0.0093;
		} else if(bi <= 580650) {
			ts = bi * 0.0241;
		} else if(bi <= 934050) {
			ts = bi * 0.1152;
		} else {
			ts = bi * 0.1452;
		}
		showMessageDialog(null, "Trinnskatten er på: " + ts + "kr");
	}

}

package dat100hvl.no;

import static javax.swing.JOptionPane.*;
import java.lang.Integer;

public class OppgaveO3 {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Skriv inn nummer");
		int tall = Integer.parseInt(tallTxt);
		int sum = 1;
		
		for( int i = 0; i < tall; i++)
		{
			sum += sum * i;
		}
		System.out.print(sum);

	}

}

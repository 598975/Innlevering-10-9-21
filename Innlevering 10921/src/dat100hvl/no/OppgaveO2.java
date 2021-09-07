package dat100hvl.no;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgaveO2 {

	public static void main(String[] args) {		
		for(int i = 0; i < 10; i++)
		{
			String poengTxt = showInputDialog("Poengsum: ");
			int poeng = parseInt(poengTxt);
			String karakter = "lorem ipsum";
			
			if(poeng < 0 || poeng > 100) {
				showMessageDialog(null, "Poengsummen må være imellom 0 og 100, vennligst skriv inn på nytt");
				i--;
			}else {
				if(poeng <= 39)
				{
					karakter = "F";
				}else if(poeng <= 49) {
					karakter = "E";
				}else if(poeng <= 59) {
					karakter = "D";
				}else if(poeng <= 79) {
					karakter = "C";
				}else if(poeng <= 89) {
					karakter = "B";
				}else if(poeng <= 100) {
					karakter = "A";
				}
				System.out.println("Karakteren er " + karakter);
			}
		}
	}
}

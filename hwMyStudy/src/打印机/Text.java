package ´òÓ¡»ú;

public class Text {

	public static void main(String[] args) {
		Printer pn = new Colorprinter();
		pn.printer();
		pn.color();
		
		Printer pn2 = new Hp();
		pn2.printer();
		pn2.color();
	}
}

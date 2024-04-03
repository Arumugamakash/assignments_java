package assignment14.qn5;

public class MainClass {
	public static void main(String[] args) {
		Document pdf=new PdfDocument();
		pdf.open();
		pdf.read();
		pdf.close();
		System.out.println("**********************");
		Document text=new TextDocument();
		text.open();
		text.read();
		text.close();
		System.out.println("***********************");
		Document image=new ImageDocument();
		image.open();
		image.close();
		image.read();
	}

}

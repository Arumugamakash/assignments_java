package assignment14.qn5;

/*
5. Create 'Document' abstract class. Create subclasses like PDFDocument, TextDocument, ImageDocument, etc. 
Create abstract methods and concrete methods and demonstrate how they work.
 */
public abstract class Document {
	public abstract void open();

	public void read() {
		System.out.println("Document readed");
	}

	public abstract void close();

}

class PdfDocument extends Document {

	@Override
	public void open() {
		System.out.println("PDF opened");
	}

	@Override
	public void close() {
		System.out.println("PDF Closed");
	}

	public void read() {
		System.out.println("pdf readed");
	}
}

class TextDocument extends Document {
	@Override
	public void open() {
		System.out.println("TextDoucment opened");
	}

	@Override
	public void close() {
		System.out.println("TextDoucment Closed");
	}

	public void read() {
		System.out.println("TextDocument Readed");
	}

}

class ImageDocument extends Document {

	@Override
	public void open() {
		System.out.println("Image opened");
	}

	@Override
	public void close() {
		System.out.println("Image Closed");
	}

}

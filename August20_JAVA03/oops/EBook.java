package August20_JAVA03.oops;

interface Readable{
	void read();
}

interface Downloadable{
	void download();
}

public class EBook implements Readable,Downloadable {

	String title;
	String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public EBook(){

	}
	public EBook(String author, String title) {
		this.author = author;
		this.title = title;
	}
	public void read() {
		System.out.println("Reading the book: " + getTitle() + " by " + getAuthor());
	}

	public void download() {
		System.out.println("Downloading the book: " + getTitle() + " by " + getAuthor());
	}

	public static void main(String[] args) {
		EBook ebook = new EBook();
		ebook.setAuthor("Jones Samuel");
		ebook.setTitle("He Died For Us We need to Repent");
		ebook.read();
		ebook.download();
	}
}

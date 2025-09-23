

class LibrarySystem {
     
	String authorName;
	String title;
	int bookId;
	
	LibrarySystem() {
		super();
		this.authorName="Sagar Vaidya";
		this.title ="Radha";
		this.bookId= 10;
	}

	LibrarySystem(String authorName, String title, int bookId) {
		super();
		this.authorName = authorName;
		this.title = title;
		this.bookId = bookId;
	}

	String getAuthorName() {
		return authorName;
	}

	void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	int getBookId() {
		return bookId;
	}

	void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	void display() {
		System.out.println("Author Name: "+ this.authorName);
		System.out.println("Book Title: "+ this.title);
		System.out.println("Book Number: "+this.bookId);
	}
	
}

class Book extends LibrarySystem
{
	
	int pages;
	boolean isavailable;
	
	Book() {
		super();
		this.pages= 50;
		this.isavailable= true;
	}

	Book(String authorName, String title, int bookId, int pages, boolean isavailable) {
		super(authorName, title, bookId);
		this.pages = pages;
		this.isavailable = isavailable;
	}

	int getPages() {
		return pages;
	}

	void setPages(int pages) {
		this.pages = pages;
	}

	boolean isIsavailable() {
		return isavailable;
	}

	void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}
	
	void display()
	{
		super.display();
		System.out.println("Number of Pages: "+ this.pages);
		System.out.println("Is book Available: "+ this.isavailable);
	}
	
}

class Magazin extends LibrarySystem
{
   int issueNumber;

   Magazin() {
   	super();
   	this.issueNumber= 29;
    }

   Magazin( String authorName, String title, int bookId, int issueNumber) {
	super(authorName, title,  bookId);
	this.issueNumber = issueNumber;
    }

    int getIssueNumber() {
	return issueNumber;
    }

    void setIssueNumber(int issueNumber) {
	this.issueNumber = issueNumber;
    }
   
    void display()
	{
		super.display();
		System.out.println("Issue Number: "+ this.issueNumber);
	}
	 
}

class LibrarySystemMain
{
	public static void main(String[] args) {
		
		LibrarySystem L1 = new LibrarySystem();
		L1.display();
		
		System.out.println();
		
        L1 = new Book("James goslin", "Java", 102, 70, true);   //Upcasting
        L1.display();
        
        System.out.println();
		
        L1 = new Magazin("James goslin", "Java", 104, 22);     //Upcasting
        L1.display();
		
	}
	
}

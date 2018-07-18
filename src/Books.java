

public class Books {
    private int isbn;
    private int pages;
    private String author;
    private String publisher;
    private String genre;
    private String pubDate;
    private String BookName;

    // set isbn
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    // get isbn
    public int getIsbn() {
        return this.isbn;
    }

    // set pages
    public void setPages(int pages) {
        this.pages = pages;
    }

    // get pages
    public int getPages() {
        return this.pages;
    }

    // set author
    public void setAuthor(String author) {
        this.author = author;
    }

    //get author
    public String getAuthor() {
        return this.author;
    }

    //set publisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //get publisher
    public String getPublisher() {
        return this.publisher;
    }

    //set genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    //get genre
    public String getGenre() {
        return this.genre;
    }

    //set pubdate
    public void setPubDate(String date) {
        this.pubDate = date;
    }

    //get pubdate
    public String getPubDate() {
        return this.pubDate;
    }

    //set bookname
    public void setBookName(String bookName) {
        this.BookName = bookName;
    }

    //get bookname
    public String getBookName() {
        return this.BookName;
    }
}
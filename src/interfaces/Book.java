package interfaces;


public class Book implements Product{
    private  String name;

    private String author;
    private int pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
this.name = name;
    }
}

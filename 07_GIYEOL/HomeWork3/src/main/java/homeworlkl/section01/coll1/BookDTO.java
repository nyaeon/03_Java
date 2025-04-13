package homeworlkl.section01.coll1;

public class BookDTO {
    private int bNO;
    private int category;
    private String title;
    private String author;

    public BookDTO() {
    }

    public BookDTO(int bNO, String author, String title, int category) {
        this.bNO = bNO;
        this.author = author;
        this.title = title;
        this.category = category;
    }

    public int getbNO() {
        return bNO;
    }

    public void setbNO(int bNO) {
        this.bNO = bNO;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bNO=" + bNO +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

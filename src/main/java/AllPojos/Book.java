package AllPojos;

public class Book {
    private int id;
    private String name;
    private int pages;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    public Book(int i, String core_java, int i1) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

public class Lesson {

    private String title;
    private int number;

    public Lesson(String title, int number) {
        this.title = title;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "title='" + title + '\'' +
                ", number=" + number +
                '}';
    }

}

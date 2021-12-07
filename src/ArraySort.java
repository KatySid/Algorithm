package lesson1;

public class ArraySort {
    private String title;
    private long time;

    public ArraySort(String title, long time) {
        this.title = title;
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "ArraySort{" +
                "title='" + title + '\'' +
                ", time=" + time +
                '}';
    }
}

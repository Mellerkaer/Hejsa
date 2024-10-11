public class Sang {

    public String title;

    public Sang(String titel) {
        this.title = titel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Sangens: " + "title = " + title;
    }
}

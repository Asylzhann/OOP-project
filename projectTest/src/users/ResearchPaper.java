package users;

public class ResearchPaper {
    private String doi;
    private String name;
    private String date;
    private int pages;
    private int citations;

    public ResearchPaper(String doi, String name, String date, int pages, int citations) {
        this.doi = doi;
        this.name = name;
        this.date = date;
        this.pages = pages;
        this.citations = citations;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getCitations() {
        return citations;
    }
}

package users;

import java.util.Comparator;

public interface Researcher {
    void addPaper(ResearchPaper paper);
    void printPapers(Comparator<ResearchPaper> comparator);
    double calculateHIndex();
}

package users;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ResearcherDecorator implements Researcher {
    private User user; // The wrapped user object (Student, Teacher, or Employee)
    private List<ResearchPaper> papers;

    public ResearcherDecorator(User user) {
        this.user = user; // Wrap the User (Student, Teacher, etc.)
        this.papers = new ArrayList<>();
    }

    @Override
    public void addPaper(ResearchPaper paper) {
        papers.add(paper);
        System.out.println("Added research paper: " + paper.getName());
    }

    @Override
    public void printPapers(Comparator<ResearchPaper> comparator) {
        papers.sort(comparator);
        for (ResearchPaper paper : papers) {
            System.out.println(paper.getName() + " - " + paper.getDate());
        }
    }

    @Override
    public double calculateHIndex() {
        List<Integer> citations = papers.stream().map(ResearchPaper::getCitations).sorted(Comparator.reverseOrder()).toList();
        int hIndex = 0;
        for (int i = 0; i < citations.size(); i++) {
            if (citations.get(i) >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }
        System.out.println("Calculated h-index: " + hIndex);
        return hIndex;
    }
}

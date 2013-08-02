package gradebook.model;

/**
 * Gradebook Item contains,
 * name, category, score
 *
 * @author Seong Pil Yoo
 */
 public class GradebookItem {
    private String name;
    private GradebookCategory category;
    private Score score;

    public GradebookItem(String name, GradebookCategory category) {
        this.name = name;
        this.category = category;
        this.score = new Score(0, 0);
    }

    public GradebookItem(String name, GradebookCategory category,
        Score score) {
        this.name = name;
        this.category = category;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCategory(GradebookCategory category) {
        this.category = category;
    }

    public GradebookCategory getCategory() {
        return this.category;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Score getScore() {
        return this.score;
    }
 }

public class Teacher extends Person {

    private Section[] section = new Section[10];
    private String subjects;
    private int sectionCount = 0;

    public Teacher(String name, String subjects) {
        super(name);
        this.subjects = subjects;

    }

    public Section[] getSection() {
        return section;
    }

    public void setSection(Section[] section) {
        this.section = section;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public void addSection(Section section){
        this.section[sectionCount] = section;
        sectionCount++;
    }
}


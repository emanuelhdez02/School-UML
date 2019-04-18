public class School {
    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount;

    public School(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section[] getSections() {
        return sections;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }
    public void addSection(Section section){
        this.sections[sectionCount] = section;
        sectionCount++;
    }
}

public class Student extends Person{
    private Section[] section = new Section[10];
    private int grade;
    private int sectionCount = 0;

    public Student(String name, int grade){
        super(name);
        this.grade = grade;
    }

    public Section[] getSection() {
        return section;
    }

    public void setSection(Section[] section) {
        this.section = section;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }
}


public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section(Teacher teacher, String name ){
        this.teacher = teacher;
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        this.students[currentSize] = student;
        currentSize++;
    }

    public String getName() {
        return name;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String n = "";
        for(int i = 0; i < students.length;i++){
            if(students[i]!=null) {
                n = n + " " + students[i].getName();
            }
        }
        String x = "This " + name + " class is taught by " + teacher.getName() + " and has " + currentSize
                + " students:" + n;
        return x;
    }
}
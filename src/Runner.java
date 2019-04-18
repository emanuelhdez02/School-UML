public class Runner {
    public static void main(String[] args){
        School bhs = new School("Berkeley High");
        Teacher matt = new Teacher("Mr.Albinson", "Math");
        Teacher glenn = new Teacher("Mr.Wolkenfeld", "Science");
        Teacher victor = new Teacher("Mr.Aguilera", "TOK");
        Section math = new Section(matt,"math");
        Section bio = new Section(glenn,"Biology");
        Section tok = new Section(victor,"TOK");
        Student adrian = new Student("Adrian Hernandez", 100);
        Student manny = new Student("Emanuel Hernandez", 95);
        Student mario = new Student("Mario Gonzalez", 97);
        Student loht = new Student("Dael Loht", 92);
        Student salaah = new Student("Salaah Deen", 80);
        Student sammi = new Student("Sammi Chavez",85);

        math.setTeacher(matt);
        bio.setTeacher(glenn);
        tok.setTeacher(victor);
        
    }
}

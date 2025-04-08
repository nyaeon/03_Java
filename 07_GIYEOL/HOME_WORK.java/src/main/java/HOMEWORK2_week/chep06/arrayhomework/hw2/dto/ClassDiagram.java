package HOMEWORK2_week.chep06.arrayhomework.hw2.dto;

public class ClassDiagram {
    private int grade;
    private int className;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public ClassDiagram() {
    }

    public ClassDiagram(int grade, int className,String name, int kor,int eng, int math ) {
        this.grade = grade;
        this.name = name;
        this.className = className;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "ClassDiagram{" +
                "grade=" + grade +
                ", className=" + className +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}






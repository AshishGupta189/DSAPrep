package evaluation_19sep.prob2;

public class StudentBean {
    private int marks;
    private String name;

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return ("Name: "+name+","+"Marks: "+marks);
    }
    public StudentBean(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

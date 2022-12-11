package assignment_day10;

public class prob1 {
    public static class StudentBean{
        private int roll;
        private String name;
        private int marks;

        @Override
        public String toString() {
            return "StudentBean{" +
                    "roll=" + roll +
                    ", name='" + name + '\'' +
                    ", marks=" + marks +
                    ", grade=" + grade +
                    '}';
        }


        private char grade;


        public void displayDetails(int roll, String name, int marks){
            this.roll = roll;
            this.name = name;
            this.marks = marks;
            char gr=calculateGrade(marks);
            this.grade=gr;
        };
        private char calculateGrade(int marks) {
            if (marks >= 500) {
                return 'A';
            } else if (marks >= 400 && marks < 500) {
                return 'B';
            }
            return 'C';
        }

    }



}

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> marks; // List to store multiple marks

    public Student() {
        marks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMark(int mark) {
        if (validateMark(mark)) {
            marks.add(mark);
        } else {
            System.out.println("Invalid mark: " + mark + ". Must be between 0 and 100.");
        }
    }

    public double calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return marks.isEmpty() ? 0 : (double) total / marks.size();
    }

    public String getGrade() {
        double average = calculateAverage();
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "E";
    }

    private boolean validateMark(int mark) {
        return mark >= 0 && mark <= 100; // Validates mark range
    }
}
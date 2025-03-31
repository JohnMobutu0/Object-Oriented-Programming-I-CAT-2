public class StudyAssistant {
    public static void main(String[] args) {
        // Student creation and grade calculation
        Student student = new Student();
        student.setName("Alice");
        student.addMark(85);
        student.addMark(90);
        student.addMark(76);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Average Marks: " + student.calculateAverage());
        System.out.println("Grade: " + student.getGrade());

        // Animal interaction
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("\nAnimal Interaction:");
        dog.startMakingSound();
        dog.startMakingSound(); // Should notify it's already making sound
        dog.stopMakingSound();
        cat.startMakingSound();
        cat.stopMakingSound();

        // Appliance interaction
        Fan fan = new Fan();
        TV tv = new TV();

        System.out.println("\nAppliance Interaction:");
        fan.turnOn();
        tv.turnOn();

        // Exception handling demonstration
        System.out.println("\nDivision of two numbers:");
        DivisionHandler divisionHandler = new DivisionHandler();
        divisionHandler.performDivision();
    }
}
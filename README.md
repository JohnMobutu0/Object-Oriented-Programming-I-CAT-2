# Object-Oriented-Programming-I-CAT-2


The system acts as a virtual **Study Assistant** for a student, integrating various interactive and functional components to simulate a learning environment. It accomplishes several tasks that a real-world student might encounter during their studies:

1. **Grading System**:
   - The student can input multiple exam or assignment marks, and the system calculates an average and assigns a grade (A, B, C, D, or E) based on the results.
   - It ensures that all entered marks are valid (between 0 and 100) to maintain data integrity.

2. **Animal Interaction**:
   - The student can virtually interact with animals, such as a dog or a cat, and instruct them to start or stop making sounds.
   - If the animal is already making a sound, the system notifies the user, simulating real-time interaction. This is designed to mimic a biology experiment where students observe animal behavior.

3. **Appliances**:
   - The student can control appliances like a fan or a TV in their virtual study environment. Each appliance can be turned on, showcasing the functional abstraction of real-world tools.

4. **Mathematical Operations and Robustness**:
   - The system handles division problems for students safely by implementing exception handling to catch any runtime errors, such as division by zero. This ensures that the program doesn't crash and provides meaningful feedback in such scenarios.

The system combines these elements into a cohesive study simulation where the student can manage grades, interact with their surroundings, and safely handle error-prone tasks like division.





1. **Encapsulation in the `Student` Class**:
   - The `Student` class uses private attributes (`name` and `marks`) to safeguard the data. Public methods (`addMark`, `calculateAverage`, `getGrade`) allow controlled access and manipulation.
   - Marks are validated (0–100) before being added, and the average is calculated dynamically. Based on the average, a grade (A–E) is assigned.

2. **Animal Interaction (Polymorphism and Method Overriding)**:
   - The `Animal` class acts as the base class for `Dog` and `Cat`. It provides the common functionality (`startMakingSound` and `stopMakingSound`).
   - Subclasses (`Dog`, `Cat`) override the abstract method `makeSound` to specify their unique sounds (e.g., "Dog barks!" or "Cat meows!").
   - Using polymorphism, the main program (`StudyAssistant`) interacts with both `Dog` and `Cat` objects through the common `Animal` interface.

3. **Appliance Interaction (Abstraction)**:
   - The abstract class `Appliance` enforces the `turnOn` behavior in all appliances (e.g., a fan or TV).
   - Subclasses implement `turnOn` to specify specific behavior for each appliance.
   - This demonstrates abstraction by hiding unnecessary internal details of each appliance and allowing interaction through a standard interface.

4. **Exception Handling with Division**:
   - The `DivisionHandler` class reads two integers from the user and attempts division. If the divisor is zero, an `ArithmeticException` is caught, and the user is notified with "Cannot divide by zero!".
   - This ensures robust and user-friendly error handling, preventing program crashes during runtime.

5. **Integration in the `StudyAssistant` Class**:
   - The `StudyAssistant` class acts as the control center, orchestrating interactions across all components.
   - It initializes a `Student` object, prompting the student to enter marks and displaying their final grade.
   - It manages interactions with `Dog` and `Cat` objects, allowing the student to simulate commanding the animals.
   - Appliance objects (`Fan` and `TV`) are turned on as part of the study environment simulation.
   - Division handling is executed, showcasing safe handling of user input and arithmetic operations.

---

The `StudyAssistant` class ties the system into a cohesive experience:
1. **Student Workflow**:
   - The student adds marks using the `addMark` method, and their final grade is displayed after calculating the average.

2. **Animal Interaction Workflow**:
   - Through the `Dog` and `Cat` classes, the student can make animals start or stop making sounds. This uses method overriding to implement specific behavior for each animal.

3. **Appliance Workflow**:
   - Appliances like the fan and TV are controlled in the simulated study environment, demonstrating abstraction in a practical scenario.

4. **Division Task Workflow**:
   - A simple division problem is solved interactively, with the system gracefully handling errors like division by zero.


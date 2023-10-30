package Assigments;

import java.util.Scanner;

class Subject {
    private int marks;

    public Subject(String name) {
        this.marks = 0;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Student {
    private Subject[] subjects;

    public Student(String name, String rollNumber) {
        this.subjects = new Subject[2];
        subjects[0] = new Subject("Maths");
        subjects[1] = new Subject("English");
    }

    public Subject[] getSubjects() {
        return subjects;
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Teacher {
    public void setMarks(Student student, String subjectName, int marks) {
        Subject[] subjects = student.getSubjects();
        for (Subject subject : subjects) {
            if (subject.getName().equals(subjectName)) {
                subject.setMarks(marks);
                break;
            }
        }
    }

    public double findAverageMarks(Student[] students) {
        int totalMarks = 0;
        int totalSubjects = students.length * 2; // 2 subjects per student
        for (Student student : students) {
            for (Subject subject : student.getSubjects()) {
                totalMarks += subject.getMarks();
            }
        }
        return (double) totalMarks / totalSubjects;
    }

    public void findMaxMinMarks(Student[] students) {
        int maxMarks = Integer.MIN_VALUE;
        int minMarks = Integer.MAX_VALUE;
        for (Student student : students) {
            for (Subject subject : student.getSubjects()) {
                int marks = subject.getMarks();
                maxMarks = Math.max(maxMarks, marks);
                minMarks = Math.min(minMarks, marks);
            }
        }
        System.out.println("Maximum Marks: " + maxMarks);
        System.out.println("Minimum Marks: " + minMarks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();

        // Instantiate 10 students
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student("Student" + (i + 1), "Roll" + (i + 1));
        }

        // Set marks for each student and subject
        for (Student student : students) {
            for (Subject subject : student.getSubjects()) {
                System.out.print("Enter marks for " + student.getName() + " in " + subject.getName() + ": ");
                int marks = scanner.nextInt();
                teacher.setMarks(student, subject.getName(), marks);
            }
        }

        // Prompt the teacher to find average, max, and min marks
        System.out.println("Select an option:");
        System.out.println("a) Find average of marks");
        System.out.println("b) Find Max and Min marks");
        char option = scanner.next().charAt(0);

        if (option == 'a') {
            double averageMarks = teacher.findAverageMarks(students);
            System.out.println("Average Marks: " + averageMarks);
        } else if (option == 'b') {
            teacher.findMaxMinMarks(students);
        } else {
            System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
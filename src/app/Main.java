package app;

import elements.*;
import visitors.*;

public class Main {

    public static void main(String[] args) {

        AssignmentAssessment a1 = new AssignmentAssessment("Assignment 1", 1, 80);
        AssignmentAssessment a2 = new AssignmentAssessment("Assignment 2", 1, 90);
        AssignmentAssessment a3 = new AssignmentAssessment("Assignment 3", 1, 75);

        QuizAssessment q1 = new QuizAssessment("MCQ Quiz 1", 1, 85);
        ExamAssessment midterm = new ExamAssessment("Midterm", 1, 70);

        AssignmentAssessment a4 = new AssignmentAssessment("Assignment 4", 2, 88);
        AssignmentAssessment a5 = new AssignmentAssessment("Assignment 5", 2, 92);
        AssignmentAssessment a6 = new AssignmentAssessment("Assignment 6", 2, 90);

        QuizAssessment q2 = new QuizAssessment("MCQ Quiz 2", 2, 80);
        ExamAssessment endterm = new ExamAssessment("Endterm", 2, 85);

        FinalExamAssessment project = new FinalExamAssessment("Team Project", 95);

        AttestationCalculationVisitor attestationVisitor = new AttestationCalculationVisitor();

        a1.accept(attestationVisitor);
        a2.accept(attestationVisitor);
        a3.accept(attestationVisitor);
        q1.accept(attestationVisitor);
        midterm.accept(attestationVisitor);

        a4.accept(attestationVisitor);
        a5.accept(attestationVisitor);
        a6.accept(attestationVisitor);
        q2.accept(attestationVisitor);
        endterm.accept(attestationVisitor);

        double first = attestationVisitor.getFirstAttestation();
        double second = attestationVisitor.getSecondAttestation();

        FinalTotalVisitor totalVisitor = new FinalTotalVisitor(first, second);

        project.accept(totalVisitor);

        System.out.println("COURSE RESULTS:");
        System.out.println("First Attestation: " + first + " / 100");
        System.out.println("Second Attestation: " + second + " / 100");
        System.out.println("Team Project (Final Exam): " + totalVisitor.getFinalExam() + " / 100");
        System.out.println("Total Result: " + totalVisitor.getTotal() + " / 100");
    }
}
package visitors;

import elements.AssignmentAssessment;
import elements.ExamAssessment;
import elements.FinalExamAssessment;
import elements.QuizAssessment;

public class AttestationCalculationVisitor implements AssessmentVisitor {

    private double firstAttestation = 0;
    private double secondAttestation = 0;

    private void addPoints(int attestationNumber,double points) {
        if (attestationNumber == 1) {
            firstAttestation += points;
        } else if (attestationNumber == 2) {
            secondAttestation += points;
        }
    }

    @Override
    public void visitAssignment(AssignmentAssessment assignment) {
        addPoints(assignment.getAttestation(),assignment.getEarnedPoints());
    }

    @Override
    public void visitExam(ExamAssessment exam) {
        addPoints(exam.getAttestation(),exam.getEarnedPoints());
    }

    @Override
    public void visitFinal(FinalExamAssessment finalExam) {
    }

    @Override
    public void visitQuiz(QuizAssessment quiz) {
        addPoints(quiz.getAttestation(),quiz.getEarnedPoints());
    }

    public double getFirstAttestation() {
        return firstAttestation;
    }

    public double getSecondAttestation() {
        return secondAttestation;
    }
}
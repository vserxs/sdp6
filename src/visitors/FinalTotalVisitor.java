package visitors;

import elements.AssignmentAssessment;
import elements.ExamAssessment;
import elements.FinalExamAssessment;
import elements.QuizAssessment;

public class FinalTotalVisitor implements AssessmentVisitor {

    private double firstAttestation;
    private double secondAttestation;
    private double finalExam;

    public FinalTotalVisitor(double firstAttestation, double secondAttestation) {
        this.firstAttestation = firstAttestation;
        this.secondAttestation = secondAttestation;
    }

    @Override
    public void visitAssignment(AssignmentAssessment assignment) {
    }

    @Override
    public void visitExam(ExamAssessment exam) {
    }

    @Override
    public void visitFinal(FinalExamAssessment finalExam) {
        this.finalExam = finalExam.getEarnedPoints();
    }

    @Override
    public void visitQuiz(QuizAssessment quiz) {
    }

    public double getTotal() {
        return firstAttestation * 0.3 + secondAttestation * 0.3 + finalExam * 0.4;
    }

    public double getFinalExam() {
        return finalExam;
    }
}
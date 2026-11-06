package visitors;

import elements.AssignmentAssessment;
import elements.QuizAssessment;
import elements.ExamAssessment;
import elements.FinalExamAssessment;

    public interface AssessmentVisitor {

        void visitAssignment(AssignmentAssessment assignment);

        void visitQuiz(QuizAssessment quiz);

        void visitExam(ExamAssessment exam);

        void visitFinal(FinalExamAssessment finalExam);
    }


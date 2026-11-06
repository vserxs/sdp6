package elements;

import visitors.AssessmentVisitor;

public class FinalExamAssessment implements Assessment {
    private String name;
    private double percentage;

        public FinalExamAssessment(String name,double percentage) {
            this.name = name;
            this.percentage = percentage;
        }

        @Override
        public void accept(AssessmentVisitor visitor) {
            visitor.visitFinal(this);
        }

        public String getName() {
            return name;
        }

        public double getPercentage() {
            return percentage;
        }

        public double getMaximumPoints() {
            return 100;
        }

        public double getEarnedPoints() {
            return percentage;
        }
    }


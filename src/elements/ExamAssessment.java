package elements;

import visitors.AssessmentVisitor;

public class ExamAssessment implements Assessment {
    private String name;
    private int attestation;
    private double percentage;

    public ExamAssessment(String name,int attestation,double percentage) {
        this.name = name;
        this.attestation = attestation;
        this.percentage = percentage;
        }

        @Override
        public void accept(AssessmentVisitor visitor) {
           visitor.visitExam(this);
        }

        public String getName() {
            return name;
        }

        public int getAttestation() {
            return attestation;
        }

        public double getPercentage() {
            return percentage;
        }

        public double getMaximumPoints() {
            return 40;
        }

        public double getEarnedPoints() {
            return percentage * 40 / 100;
        }
    }


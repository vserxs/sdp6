package elements;

import visitors.AssessmentVisitor;

public class AssignmentAssessment implements Assessment {
    private String name;
    private int attestation;
    private double percentage;

    public AssignmentAssessment(String name,int attestation,double percentage) {
        this.name = name;
        this.attestation = attestation;
        this.percentage = percentage;
    }
    @Override
        public void accept(AssessmentVisitor visitor){
        visitor.visitAssignment(this);
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
        return 15;
    }

    public double getEarnedPoints() {
        return percentage * 15 / 100;
    }
}

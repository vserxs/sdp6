package elements;

import visitors.AssessmentVisitor;

public interface Assessment {

    void accept(AssessmentVisitor visitor);

    String getName();
    double getPercentage();
    double getMaximumPoints();
    double getEarnedPoints();
}

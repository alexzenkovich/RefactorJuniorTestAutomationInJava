package tasks.cleanCode.planes;

import tasks.cleanCode.models.ClassificationLevel;
import tasks.cleanCode.models.ExperimentalPlaneType;

import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private final ExperimentalPlaneType experimentalPlaneType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             ExperimentalPlaneType experimentalPlaneType, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalPlaneType = experimentalPlaneType;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane that = (ExperimentalPlane) o;
        return experimentalPlaneType == that.experimentalPlaneType &&
                getClassificationLevel() == that.getClassificationLevel();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalPlaneType, getClassificationLevel());
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "experimentalPlaneType=" + experimentalPlaneType +
                ", classificationLevel=" + classificationLevel +
                ", model='" + model + '\'' +
                '}';
    }
}

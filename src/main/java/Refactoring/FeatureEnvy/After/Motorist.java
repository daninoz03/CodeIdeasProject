package Refactoring.FeatureEnvy.After;

public class Motorist {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPointsOnLicense() {
        return 5;
    }

    public String getRiskFactor() {
        if (getPointsOnLicense() >3 || getAge() < 25){
            return "HIGH RISK";
        }else if (getPointsOnLicense() > 0 ) {
            return "MODERATE RISK";
        } else {
            return "LOW RISK";
        }
    }
}

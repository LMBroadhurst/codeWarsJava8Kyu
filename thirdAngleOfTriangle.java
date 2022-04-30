// Third Angle of a Triangle

public class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
        int angle3 = 180 - (angle1 + angle2);
        return angle3;
    }
}

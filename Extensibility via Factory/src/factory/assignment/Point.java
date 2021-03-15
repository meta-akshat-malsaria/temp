package factory.assignment;

public class Point {

    double xCoordinate;

    double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    /**
     * @return the x Coordinate.
     */
    public double getxCoordinate() {
        return xCoordinate;
    }

    /**
     * @param xCoordinate the xCoordinate to set
     */
    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    /**
     * @return the yCoordinate
     */
    public double getyCoordinate() {
        return yCoordinate;
    }

    /**
     * @param yCoordinate the yCoordinate to set
     */
    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    
}
package p01_ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public void setLength(double length){
        if(length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }
    public void setWidth(double width){
        if(width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }
    public void setHeight(double height){
        if(height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * (this.length * this.width + this.length * this.height + this.width * this.height);
    }

    public double getLateralSurfaceArea() {
        return 2 * (this.length * this.height + this.width * this.height);
    }

    public double getVolume() {
        return this.length * this.width * this.height;
    }


//    public double getSurfaceArea() {
//       return surfaceArea(this.length, this.width, this.height);
//    }
//
//    public double getLateralSurfaceArea(){
//        return lateralSurfaceArea(this.length, this.width, this.height);
//    }
//
//    public double getVolume(){
//        return volume(this.length, this.width, this.height);
//    }
//
//    private double surfaceArea(double length, double width, double height) {
//        return 2 * (this.length * this.width + this.length * this.height + this.width * this.height);
//    }
//
//    private double lateralSurfaceArea(double length, double width, double height){
//        //return 2 * height * (length + width);
//        return 2 * (this.length * this.height + this.width * this.height);
//    }
//
//    private double volume(double length, double width, double height){
//        return length * width * height;
//    }

//    @Override
//    public String toString() {
//        StringBuilder resultBuilder = new StringBuilder();
//        resultBuilder.append(this.getSurfaceArea())
//                .append(System.lineSeparator())
//                .append(this.getLateralSurfaceArea())
//                .append(System.lineSeparator())
//                .append(this.getVolume());
//
//        return resultBuilder.toString();
//    }

}

package level8;



public class VolumeOfCuboid {
  public static double getVolumeOfCuboid(final double length, final double width, final double height) {
    return length*width*height;
  }

  public static void main(String[] args) {              // test
    System.out.println(getVolumeOfCuboid(2,3,4));
  }
}


//////////////////////////////////////////////

class VolumeOfCuboidL {
  public static void getVolumeOfCuboid(Calculator c) {
    double length = 3.4;
    double width = 2.8;
    double height = 4.2;
    double result = c.calculate(length,width,height);
    System.out.println(result);
  }

  public static void main(String[] args) {
    getVolumeOfCuboid((length,width,height) -> length*width*height);
  }
}

@FunctionalInterface
interface Calculator{
  double calculate(double length, double width, double height);
}
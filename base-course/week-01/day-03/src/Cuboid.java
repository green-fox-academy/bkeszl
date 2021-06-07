public class Cuboid {
    public static void main(String[] args) {
        double length = 4;
        double width = 5;
        double height = 6;

        System.out.println("Surface area is: " + ((2*length*width)+(2*length*height)+(2*height*width)));
        System.out.println("Volume is: " + (length*width*height));
    }
}

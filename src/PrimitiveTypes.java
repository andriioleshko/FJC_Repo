public class PrimitiveTypes {

    public static void main(String[] args) {

        System.out.println("Primitive data types are: byte, short, int, long, float, double, "
                + "boolean and char.");

        System.out.println("For byte type min value is: " + Byte.MIN_VALUE + ", max value is: " +
                Byte.MAX_VALUE);
        System.out.println("For short type min value is: " + Short.MIN_VALUE + ", max value is: " +
                Short.MAX_VALUE);
        System.out.println("For int type min value is: " + Integer.MIN_VALUE + ", max value is: " +
                Integer.MAX_VALUE);
        System.out.println("For long type min value is: " + Long.MIN_VALUE + ", max value is: " +
                Long.MAX_VALUE);
        System.out.println("For float type min value is: " + Float.MIN_VALUE + ", max value is: " +
                Float.MAX_VALUE);
        System.out.println("For double type min value is: " + Double.MIN_VALUE + ", max value is: " +
                Double.MAX_VALUE);
        System.out.println("For character type min value is: " + Character.MIN_VALUE + ", max value is: " +
                Character.MAX_VALUE);

        System.out.println("If you add to the max value of numeric variable with 1, we will have an " +
                "overflow of this variable.");
        System.out.println("For example, increasing our max value of integer (" + Integer.MAX_VALUE + ") " +
                "by 1 will give us the min value of our variable (" + (Integer.MAX_VALUE + 1) + ").");

    }

}

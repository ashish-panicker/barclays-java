public class ExceptionDemo {

    public static void main(String[] args) {

        Math m = new Math();
        try {
            m.div2(4, 0);
            System.out.println("After the div2() call....");

        } catch (ArithmeticException ae) {

            System.err.println("Exception while dividing. main()");
            System.err.println(ae.getMessage());
        } finally {
            System.out.println("Exiting....");
        }
    }

}

class Math {

    public void div(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.err.println("Exception while dividing. div()");
            System.err.println(ae.getMessage());
        }

    }

    public void div2(int a, int b) throws ArithmeticException {
        System.out.println(a / b);

    }
}
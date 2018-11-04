public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Sample sample = new Sample();
        try {
            System.out.println(sample.divide(8,4));
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

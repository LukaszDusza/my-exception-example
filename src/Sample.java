public class Sample {

    public int divide(int a, int b) throws MyException {
        if(a < b) {
            throw new MyException();
        }
        return a / b;
    }
}

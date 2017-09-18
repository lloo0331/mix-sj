public class Bootstrap {

    public static void main(String[] args) {
        GreetingInScala scala = new GreetingInScala();
        scala.greet();

        TestScala testScala = new TestScala();
        testScala.test();
    }
}  
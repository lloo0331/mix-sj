package hello;

import hello.GreetingInScala;
import hello.HelloScala;

public class BootstrapJava {

    public static void main(String[] args) {
        GreetingInScala scala = new GreetingInScala();
        scala.greet();

        HelloScala testScala = new HelloScala();
        testScala.test();
    }
}  
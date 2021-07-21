package day2.app;

import day2.inner.HumanBody;

public class HumanBodyDemo {
    public static void main(String[] args) {
        HumanBody body = new HumanBody(56);
        HumanBody.Heart heart = body.new Heart();
    }
}

package practice.practice1;

public class Main {

    public static void main(String[] args) {

        // 方法的重载练习
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
            // 调用重载构造器
            new Tree();
        }

    }

}

package javaSE.javase22;

import javaSE.javase22.service.Eat;

/**
 * lambda表达式
 * 读作 λ 表达式 它其实就是我们接口匿名实现的简化 比如说:
 *                  public static void main(String[] args) {
 *
 *                      Eat eat = new Eat() {
 *
 *                          @Override
 *                          public void eat() {
 *                              // Do something...
 *                          }
 *
 *                      };
 *
 *                  }
 *
 *                  public static void main(String[] args) {
 *
 *                      Eat eat = () -> {}; // 等价于上述内容
 *
 *                  }
 *
 * lambda表达式(匿名内部类) 只能访问外部的final类型或是隐式final类型的局部变量
 *
 * 为了方便 JDK默认就为我们提供了专门写函数式的接口 这里只介绍consumer
 */
public class Main {

    public static void main(String[] args) {

        int c = 10;
        /*Eat eat1 = new Eat() {

            @Override
            public String eat(int i) {
                return null;
            }

        };*/

        Eat eat = i -> c + "";

    }

}

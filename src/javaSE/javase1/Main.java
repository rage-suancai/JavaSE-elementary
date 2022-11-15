package javaSE.javase1;

import java.util.Scanner;

/**
 * java对象和多态(面向对象)
 * 面向对象基础
 * 面向对象程序设计(Object Oriented Programming)
 *
 * 对象基于类创建 类相当于一个模板 对象就是根据模板创建出来的实体(就像做月饼 我们要做一个月饼首先需要一个模具 模具就是我们的类 而做出来的月饼 就是类的实现 也叫做对象)
 * 类是抽象的数据类型 并不能代表一个具体的事务 类是对象的一个模板 类具有自己的属性 包括成员变量 成员方法等 我们可以调用类的成员方法让类进行一些操作
 *                  Scanner sc = new Scanner(System.in);
 *                  String str = sc.nextLine();
 *                  System.out.println("你输入了: " + str);
 *                  sc.close();
 *
 * 所有的对象 都需要通过new 关键字创建 基本数据类型不是对象 java不是纯面对对象语言
 *
 * 不是基本类型的变量 都是引用类型 引用类型变量代表一个对象 而基本数据类型变量 保存的是基本数据类型的值 我们可以通过引用来对对象进行操作
 * (最好不要理解为引用指向对象的地址 初学者不要谈内存 学到JVM时再来讨论)
 *
 * 对象占用的内存由JVM统一管理 不需要手动释放内存 当一个对象不再使用时(比如失去了引用或是离开了作用域) 会被JVM自动清理 内存管理更方便
 */
public class Main {

    static void test1() {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("你输入了: " + str);
        sc.close();

    }

    public static void main(String[] args) {
        test1();
    }

}

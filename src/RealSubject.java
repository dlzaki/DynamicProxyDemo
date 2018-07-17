/**
 * @Auther: zhangh
 * @Date: 2018/7/17.
 * @Description:
 */
public class RealSubject implements Subject{

    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello: " + str);
    }
}

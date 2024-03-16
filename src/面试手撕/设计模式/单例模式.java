package 面试手撕.设计模式;

/**
 * @author spike
 * @version 1.0.0
 */
public class 单例模式 {


    private  单例模式(){
        System.out.println("创建对象");
    }


    /**
     * 饿汉式
     */

   /* private  static final 单例模式 instance = new 单例模式();

    public static   单例模式 getInstance(){
        return instance;
    }*/

    /**
     * 懒汉式
     */

   /* private static volatile 单例模式 instance;


    public static 单例模式  getInstance() {
       if(instance == null){
         synchronized (单例模式.class){
             if(instance == null){
                 instance = new 单例模式();
             }
         }
       }

       return instance;
    }
*/

    /**
     * 懒汉模式推荐 内部类实现
     */

    private static  class  Context{
        private static final  单例模式 instance = new 单例模式();
    }

    public static 单例模式 getInstance(){
        return Context.instance ;
    }


}

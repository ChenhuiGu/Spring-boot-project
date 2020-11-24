package pers.guchh.jdkProxy;
import pers.guchh.dao.UserDao;
import pers.guchh.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),
                interfaces,
                new UserDaoProxy(userDao));
        int x = dao.add(4,6);
        System.out.println(x);

    }

}

class UserDaoProxy implements InvocationHandler{
    private Object obj;
    UserDaoProxy(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前执行...."
                +method.getName()+" :传递的参 数..."+
                Arrays.toString(args));
        //被增强的方法执行
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println("方法之后执行...."+obj);
        return res;
    }
}
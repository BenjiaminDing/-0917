package clientDemo;

import com.caucho.hessian.client.HessianProxyFactory;
import service.Basic;

/**
 * created by benjiamin at  2021/9/17 10:23 hessianfirst
 */
public class BasicClient {
    public static void main(String[] args) {
        try {
            String url = "http://localhost:8080/hessian";
            HessianProxyFactory factory = new HessianProxyFactory();
            factory.setOverloadEnabled(true);
            Basic basic = (Basic) factory.create(Basic.class, url);
            System.out.println(basic.sayHello("BENJIAMIN"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

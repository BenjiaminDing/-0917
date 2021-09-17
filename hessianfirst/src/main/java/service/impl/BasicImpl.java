package service.impl;

import service.Basic;

/**
 * created by benjiamin at  2021/9/17 10:17 hessianfirst
 */
public class BasicImpl   implements Basic {


    @Override
    public String sayHello(String name) {
        return "This is Hello words from HESSIAN Server." + name;
    }
}

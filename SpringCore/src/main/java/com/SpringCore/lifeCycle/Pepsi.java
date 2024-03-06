/**
 * The `Pepsi` class in the `com.SpringCore.lifeCycle` package represents a simple class with a private
 * field for price, along with getter, setter, and toString methods, implementing InitializingBean and
 * DisposableBean interfaces with unimplemented methods.
 */
package com.SpringCore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * The class Pepsi has a private field for price.
 */

public class Pepsi implements InitializingBean,DisposableBean{
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi [price=" + price + "]";
    }

    public Pepsi() {
    }

   /**
    * The `afterPropertiesSet` method is overridden to throw an `UnsupportedOperationException`
    * indicating that the method is unimplemented.
    */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("taking pepsi:init");
        // You may want to provide a meaningful implementation here or remove the throw statement.
        // throw new UnsupportedOperationException("Unimplemented method 'afterPropertiesSet'");
    }


@Override
public void destroy() {
    // TODO Auto-generated method stub
    System.out.println("Going to put bottle back to shope");
//    throw new UnsupportedOperationException("Unimplemented method 'destroy'");
}

}

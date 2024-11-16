package pro.sky.skypro_spring_cart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Component
@SessionScope
public class Cart extends ArrayList<Integer> {

    private ArrayList<Integer> cart;


    public ArrayList<Integer> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Integer> cart) {
        this.cart = cart;
    }

}

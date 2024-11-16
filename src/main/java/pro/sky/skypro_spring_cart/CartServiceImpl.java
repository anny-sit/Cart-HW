package pro.sky.skypro_spring_cart;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Service
@SessionScope
public class CartServiceImpl implements CartService {
    private Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String add(String items) {
        String[] splitted = items.split(";");
        ArrayList<Integer> itemsToAdd = null;
        for (String str: splitted) {
            itemsToAdd.add(Integer.parseInt(str));
        }
        cart.setCart(itemsToAdd);
        return "items added";

    }

    @Override
    public Cart get() {
        return cart;
    }
}

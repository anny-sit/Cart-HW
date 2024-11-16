package pro.sky.skypro_spring_cart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order")

public class CartController {

    private final CartServiceImpl cartService;

    public CartController(CartServiceImpl cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("items") String items) {
        return cartService.add(items);
    }

    @GetMapping("/get")
    public Cart get() {
        return cartService.get();
    }

    @GetMapping
    public String hello() {
        return "hey";
    }

}

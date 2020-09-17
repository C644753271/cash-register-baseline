package cashregister;

/**
 * ************************************************
 * 功能描述:
 *
 * @author Andy Wilkinson
 * @version 1.0
 * @date 2020/9/1711:29创建文件}
 * @see ************************************************
 */
public class StubbedPurchase extends Purchase {

    private final String str;

    public StubbedPurchase(String str) {
        super(new Item[]{});
        this.str = str;
    }

    @Override
    public String asString() {
        return this.str;
    }
}

package cashregister;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * ************************************************
 * 功能描述:
 *
 * @author Andy Wilkinson
 * @version 1.0
 * @date 2020/9/2316:47创建文件
 * @see ************************************************
 */
public class MockitoTest {

    @Test
    public void should_print_the_real_purchase() {
        //given
        Printer printer = Mockito.mock(Printer.class);
        CashRegister register = new CashRegister(printer);
        Purchase purchase = new Purchase(new Item[]{});
        //when
        register.process(purchase);
        //then
        Mockito.verify(printer, Mockito.times(1)).print("");
    }

    @Test
    public void should_print_the_stubbed_purchase() {
        //given
        Printer printer = Mockito.mock(Printer.class);
        CashRegister register = new CashRegister(printer);
        Purchase purchase = Mockito.mock(Purchase.class);
        //when
        register.process(purchase);
        //then
        Mockito.verify(printer, Mockito.times(1)).print(null);
    }

}

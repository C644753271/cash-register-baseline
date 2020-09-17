package cashregister;

import org.junit.Test;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase() {


        MockPrinter printer = new MockPrinter();
        CashRegister cashRegister = new CashRegister(printer);

        Item[] items = new Item[]{
                new Item("item1", 1.23),
                new Item("item2", 3.14)
        };
        Purchase purchase = new Purchase(items);

        cashRegister.process(purchase);
        
        //initialize CashRegister and fake Printer

        //cashRegister.process(purchase);

        //verify that printer was called
        printer.verifyProcessWasCalledWithPurchase("item1\t1.23\nitem2\t3.14\n");
    }
}

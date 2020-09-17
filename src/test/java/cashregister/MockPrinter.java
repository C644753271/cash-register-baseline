package cashregister;

import org.junit.Assert;

/**
 * ************************************************
 * 功能描述:
 *
 * @author Andy Wilkinson
 * @version 1.0
 * @date 2020/9/1710:44创建文件
 * @see ************************************************
 */
public class MockPrinter extends Printer {

//    verifyProcessWasCalledWithPurchase

    private String printStr;

    @Override
    public void print(String printThis) {
//        super.print(printThis);
        printStr = printThis;
    }

    public void verifyProcessWasCalledWithPurchase(String s) {
        Assert.assertTrue("error", s.equals(printStr));
    }

}

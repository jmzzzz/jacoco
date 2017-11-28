import org.junit.Test;

public class TestMoney {

    @Test
    public void testGetUnitMoney(){
        MoneyUtil moneyUtil = new MoneyUtil();
        moneyUtil.getUnitMoney("50", 2);
        moneyUtil.getUnitMoney("60", 2);
        moneyUtil.getUnitMoney("70", 2);
        moneyUtil.getUnitMoney("75", 2);
    }

    @Test
    public void testGetFenMoney(){
        MoneyUtil moneyUtil = new MoneyUtil();
        moneyUtil.getFenMoney("1000");
    }

}

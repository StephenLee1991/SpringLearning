package ioc.byautowire;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 14:45
 */
public class Wallet {

    private Money paperCurrency;
    private Money coin;

    public Wallet() {
        System.out.println("准备花钱!");
    }

    public void setPaperCurrency(Money paperCurrency) {
        System.out.println("选择纸币额度！");
        this.paperCurrency = paperCurrency;
    }

    public void setCoin(Money coin) {
        System.out.println("选择硬币金额！");
        this.coin = coin;
    }

    public void buy(){
        paperCurrency.put();
        coin.put();
    }
}

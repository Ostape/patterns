import com.robosh.money.*;

public class Main {
    public static void main(String[] args) {
        OperationModule one = new TakeMoney();
        OperationModule two = new GovernmentTaxes();
        OperationModule three = new ConvertMoney();
        OperationModule four = new GiveMoney();

        one.setNextOperationModule(two);
        two.setNextOperationModule(three);
        three.setNextOperationModule(four);
        one.makeTransaction(new Money(1));
    }
}

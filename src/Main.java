//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
BonusMilesService service = new BonusMilesService();
service.calculate(10_000);
        int price =  10_000;
        int miles = service.calculate(price);
                System.out.println(miles);
    }


}
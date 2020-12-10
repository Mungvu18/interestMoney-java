import java.util.Scanner;

public class IntersetMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tháng cho vay");
        int month = sc.nextInt();
        System.out.println("Mời bạn nhấp số tiền cho vay");
        int money = sc.nextInt();
        System.out.println("Số tiền lãi của bạn là :"+testInterest(month,money));
    }
    public static double testInterest(int month, int money){
        double interestMoney=0;
        if(month<0){
            System.out.println("Mời bạn nhậm lại số tháng");
        } else if(month<4){
            interestMoney = month*0.05/12*money;
        } else if(month<7){
            interestMoney = month*0.06/12*money;
        } else if(month<=12){
            interestMoney = month*0.08/12*money;
        } else {
            interestMoney = month*0.1/12*money;
        }
        return interestMoney;
    }
}

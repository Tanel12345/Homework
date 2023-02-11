package pocket;

public class Pocket {
    private int money = 2;

    public Pocket(int money) {
        setMoney(money);
    }



    public int getMoney() {
        if(money <= 10){
         money = 0;
         return money;
     }
        return money;
    }


    public void setMoney(int money) {
        if(money <= 0 || money > 3000){
            System.out.println("don’ have enough space in my pocket for as much money!");
            return;
        }
        this.money = money;
    }

    public static void main(String[] args) {

        Pocket pocket = new Pocket(3000);
        pocket.setMoney(3100);
        System.out.println(pocket.getMoney());



    }
}
package baithuchanh;

public class ImplOperationAdd implements ITinhToan, IAccuracy{
    private int accuracy;
    @Override
    public void doOperation(float num1, float num2) {
        System.out.printf("\n");
        System.out.printf("Result ADD =%" + this.accuracy+"f", (num1 + num2));
    }

    @Override
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }



    public static void main(String[] args) {
       MainClass main = new MainClass();

       ImplOperationAdd add = new ImplOperationAdd();
       add.setAccuracy(IAccuracy.TWO_NUMBER);
       main.phepTinh(add, 6,9);

       ImplOperationSubtract sub = new ImplOperationSubtract();
       sub.setAccuracy(IAccuracy.THREE_NUMBER);
       main.phepTinh(sub, 6,9);

       ImplOperationMultiply multi = new ImplOperationMultiply();
       multi.setAccuracy(IAccuracy.FOUR_NUMBER);
       main.phepTinh(multi, 3, 3);
    }
}

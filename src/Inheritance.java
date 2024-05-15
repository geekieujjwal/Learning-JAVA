public class Inheritance{
    public static void main(String[] args){
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3,4);
        int r2 = obj.sub(3,4);
        int r3 = obj.mul(3,4);
        int r4 = obj.div(3,4);
        System.out.println(r4 + " " + r2 + " " + r3 + " " + r4);
    }
}
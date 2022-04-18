public class Haha implements Process{
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        Haha g = new Haha();
        g.doProcess(a);
    }

    @Override
    public void doProcess(int i) {
        System.out.println(i);
    }

}

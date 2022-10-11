public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);
        System.out.println("Current t1 time "+ t1);
        t1.nextSecond();
        System.out.println("Time in 1 sec "+t1);
        System.out.println("current t2 time "+t2);
        t2.previousSecond();
        System.out.println("time a sec ago "+t2);
    }
}

public class MainTimeSpan {
    public static void main (String[] args){
        TimeSpan t1 = new TimeSpan(1,45);
        System.out.println(t1.toString());
        t1.scale(2);
        System.out.println(t1.toString());
    }
}

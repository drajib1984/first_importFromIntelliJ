package PackageA;

public class UtilityDemo {
    public static void main(String[] args) {
        // int     char     boolean      long       double
        //Integer Character Boolean      Long        Double

        Integer i = new Integer(2);
        double v = i.doubleValue();
        System.out.println(v);

        String s = "12345";
        System.out.println(s+10);
        int i1 = Integer.parseInt(s);
        Integer integer = Integer.valueOf(s);
        long l = Long.parseLong(s);
        Long aLong = Long.valueOf(s);


    }
}

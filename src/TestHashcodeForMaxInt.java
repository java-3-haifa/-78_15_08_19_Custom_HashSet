public class TestHashcodeForMaxInt {
    public static void main(String[] args) {
        int hashcode = "polygenelubricants".hashCode();

        System.out.println(hashcode == Integer.MIN_VALUE);
        System.out.println(Math.abs(hashcode));
//        System.out.println(~hashcode);

        System.out.println(Integer.MAX_VALUE % 16);
    }
}

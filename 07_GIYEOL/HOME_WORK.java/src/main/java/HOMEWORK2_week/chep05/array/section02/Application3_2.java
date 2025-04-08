package HOMEWORK2_week.chep05.array.section02;

public class Application3_2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9, 10};
        int[] d = new int[10];
        d = new int[a.length + b.length + c.length];
        System.arraycopy(a, 0, d, 0, a.length);
        System.arraycopy(b, 0, d, a.length, b.length);
        System.arraycopy(c, 0, d, a.length + b.length, c.length);
        //System.arraycopy(d, 0, sum, a.length + b.length + c.length, d.length);
        for(int num: d) {
            System.out.print(num + " ");
        }
    }
}

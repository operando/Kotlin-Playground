import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] s) {
        Base bbbb = new BaseImpl(10);
        Derived dd = new Derived(bbbb);
        dd.println();
        System.out.println(dd.hoho("test"));
        dd.mmmmmm();

        CallingKotlinFromJavaSample.run();

        int sum = 0;
        Stream.of(1, 2, 3)
                .forEach(integer -> {
                    // Lambdaから外の変数の変更はできない
//                    sum += integer;
                });
    }

    public Supplier<Integer> getCounter() {
        int count = 0;
        return () -> {
            return count;
        };
    }

    interface Base {
        void println();

        String hoho(String s);
    }

    static class BaseImpl implements Base {

        private final int x;

        public BaseImpl(int x) {
            this.x = x;
        }

        @Override
        public void println() {
            System.out.println(x);
        }

        @Override
        public String hoho(String s) {
            return s.toLowerCase();
        }
    }

    static class Derived {
        private final Base b;
        private final String a = "aaaaa";

        public Derived(Base b) {
            this.b = b;
        }

        public void println() {
            b.println();
        }

        public String hoho(String s) {
            return b.hoho(s);
        }

        public void mmmmmm() {
            System.out.println(b.hoho(a));
        }
    }
}

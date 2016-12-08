public class Main {

    public static void main(String[] s) {
        Base bbbb = new BaseImpl(10);
        Derived dd = new Derived(bbbb);
        dd.println();
        System.out.println(dd.hoho("test"));
        dd.mmmmmm();
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

import test.C;
import test.Obj;
import test.SaSasSa;
import test.Sample;

import java.io.IOException;
import java.util.ArrayList;

public class CallingKotlinFromJavaSample {

    public static void run() {
        Sample sample = new Sample();
        System.out.println(sample.id);

        sample.humuhumu();
        sample.humuhumu(1);
        sample.humuhumu(1, "test");

        try {
            sample.okooko();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        sample.nullnullnull(null);
        sample.nullnullnullnull(null);

        sample.emptyList(); // List

//        SampleKt.test();

        SaSasSa.test();

        System.out.println(Sample.LIST);
        Sample.LIST = new ArrayList<>();

//        Obj.CONST = 0;

        int c = Obj.CONST;
        int d = SaSasSa.MAX;
        int v = C.VERSION;

        C.cccccccc();
    }
}

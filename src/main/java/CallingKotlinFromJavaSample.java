import test.SaSasSa;
import test.Sample;

public class CallingKotlinFromJavaSample {

    public static void run() {
        Sample sample = new Sample();
        System.out.println(sample.id);

//        SampleKt.test();

        SaSasSa.test();
    }
}

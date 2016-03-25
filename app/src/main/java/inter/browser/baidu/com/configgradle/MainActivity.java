package inter.browser.baidu.com.configgradle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogUtil.v("hello");
        LogUtil.d("hello");
        LogUtil.i("hello");
        LogUtil.w("hello");
        LogUtil.e("hello");
        LogUtil.wtf("hello");
        LogUtil.json("{\"name\":\"hacket\",\"pass\":\"123456\"}");
        LogUtil.xml("<root><name>hacket</name><pass>123456</pass></root>");
        try {
            String s = null;
            s.toString();
        } catch (Exception e) {
            LogUtil.e("hello", e, e.getMessage());
            LogUtil.printStackTrace(e);
        }

        LogUtil.v("tag", "hacket");
        LogUtil.d("tag", "hacket");
        LogUtil.i("tag", "hacket");
        LogUtil.w("tag", "hacket");
        LogUtil.e("tag", "hacket");
        LogUtil.wtf("tag", "hacket");
        LogUtil.json("tag", "{\"name\":\"hacket\",\"pass\":\"123456\"}");
        LogUtil.xml("tag", "<root><name>hacket</name><pass>123456</pass></root>");

        LogUtil.e(null, "this is a null tag");

    }

}
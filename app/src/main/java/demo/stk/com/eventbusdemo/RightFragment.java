package demo.stk.com.eventbusdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.greenrobot.event.EventBus;
import de.greenrobot.event.Subscribe;

public class RightFragment extends Fragment {
    MyTextView textViews;
    String[] str0 = {"java", "php", ".net", "C", "C++", "15965445"};
    String[] str1 = {"java11", "php11", ".net11", "java11", "php11", ".net11"};
    String[] str2 = {"哲学系", "新疆维吾尔族自治区", "新闻学", "心理学",
            "犯罪心理学", "明明白白", "西方文学史", "计算机", "掌声", "心太软", "生命",
            "程序开发"};
    String[] str3 = {"java3333", "php3333", ".net3333"};
    String[] str4 = {"java44444", "php44444", ".net44444"};
    String[] str5 = {"java555555", "php555555", ".net555555"};
    String[] str6 = {"java6666666", "php6666666", ".net6666666"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right, null);
        textViews = (MyTextView) view.findViewById(R.id.textview);
        //首先要注册eventbus
        EventBus.getDefault().register(this);
        return view;
    }

    /**
     * 接受EventBus数据
     *
     * @Subscribe 防止报错
     */
    @Subscribe
    public void onEvent(String event) {
        Log.e("TTT", event + "---------------");
        textViews.removeAllViews();
        int eve = Integer.parseInt(event);
        switch (eve) {
            case 0:
                for (int i = 0; i < str0.length; i++) {
                    TextView textview = new TextView(getActivity());
                    textview.setText(str0[i]);
                    textViews.addView(textview);
                }
                break;
            case 1:
                for (int i = 0; i < str1.length; i++) {
                    TextView textview = new TextView(getActivity());
                    textview.setText(str1[i]);
                    textViews.addView(textview);
                }
                break;
            case 2:
                for (int i = 0; i < str2.length; i++) {
                    TextView textview = new TextView(getActivity());
                    textview.setText(str2[i]);
                    textViews.addView(textview);
                }
                break;
            case 3:
                for (int i = 0; i < str3.length; i++) {
                    TextView textview = new TextView(getActivity());
                    textview.setText(str3[i]);
                    textViews.addView(textview);
                }
                break;
            case 4:
                for (int i = 0; i < str4.length; i++) {
                    TextView textview = new TextView(getActivity());
                    textview.setText(str4[i]);
                    textViews.addView(textview);
                }
                break;
            case 5:
                for (int i = 0; i < str5.length; i++) {
                    TextView textview = new TextView(getActivity());
                    textview.setText(str5[i]);
                    textViews.addView(textview);
                }
                break;
            case 6:
                for (int i = 0; i < str6.length; i++) {
                    TextView textview = new TextView(getActivity());
                    textview.setText(str6[i]);
                    textViews.addView(textview);
                }
                break;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //首先要注册eventbus
        EventBus.getDefault().unregister(this);
    }
}

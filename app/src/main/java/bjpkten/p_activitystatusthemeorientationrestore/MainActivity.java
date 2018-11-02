package bjpkten.p_activitystatusthemeorientationrestore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import bjpkten.p_activitystatusthemeorientationrestore.activities.ConfigChangeActivity;
import bjpkten.p_activitystatusthemeorientationrestore.activities.OrientationVActivity;
import bjpkten.p_activitystatusthemeorientationrestore.activities.StartMethodActivity;
import bjpkten.p_activitystatusthemeorientationrestore.activities.ThemeActivity;

/**
 * Activity 
 *
 * 创重启显停止销，显停止，意图，启东保存主题旋转（木马）方向
 *
 *
 *
 * 显停止，显示onResume(),onPause,onStop
 *
 * 只要是显示了一定是onResume（）
 *
 * 只要是看不见了一定是onStop()
 *
 * 只要是onStop 之前一定是onPause();
 *
 *
 *
 *
 *
 * 启动的方式可以是显示意图，就像之前的intent里面直接就是**.class 也可以是隐式意图，intent.setAction(), intent.addCategory();
 *
 *         隐式意图的最低配置：一个action,一个categoty,而且categoty的值必须是android.intent.category.DEFAULT
 *
 *         当设置了写了两个activity 在清单文件里面的action 和 category 是一样的，那么调用的时候会有一个选择的选项。
 *
 *
 *
 *
 *
 *
 *
 * 启动保存主题旋转方向
 *
 * 显示启动一个activity的三个步骤，startActivityForResult(intent,requestCode), getIntent(), setResult(),finish(), 
 *
 * 主题对话<activity android:name=".OtherActivity" android:theme="@android:style/Theme.Holo.Dialog"/>
 *
 * 屏幕旋转的检测 清单文件设置android:configChanges="keyboard|screenSize|orientation”，onConfigrationChange回调里面去判担config.orientation
 *
 * 屏幕方向的设置 在清单文件中设置Activity的orientation
 *
 * 保存和恢复（恢复一定要是执行了销毁了的，才有必要去恢复，还有不要设置上面的configChanges，设置了以后会无法调用onRestoreInstanceState）
 *
 *
 * ---------------------
 * 作者：千雅爸爸
 * 来源：CSDN
 * 原文：https://blog.csdn.net/Rodulf/article/details/72453296
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 跳转
     * @param view
     */
    public void jump(View view) {
        Intent intent  = new Intent(this,StartMethodActivity.class);
        startActivity(intent);
    }

    /**
     * 跳转到其他的样式的activity
     * @param view
     */
    public void jumpToOtherStyle(View view) {
        Intent intent = new Intent(this,ThemeActivity.class);
        startActivity(intent);
    }

    /**
     * 跳转到横屏的activity
     * @param view
     */
    public void jumpToOrientationActitiy(View view) {
        Intent intent = new Intent(this,OrientationVActivity.class);
        startActivity(intent);
    }

    /**
     * 跳转到那个配置改变的acitivity
     * @param view
     */
    public void jumpToConfigChangeActivity(View view) {
        Intent intent = new Intent(this,ConfigChangeActivity.class);
        startActivity(intent);
    }
}

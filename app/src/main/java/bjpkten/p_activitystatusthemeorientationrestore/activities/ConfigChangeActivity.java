package bjpkten.p_activitystatusthemeorientationrestore.activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

import bjpkten.p_activitystatusthemeorientationrestore.R;
import kodulf.baselibs.activity.BaseActivity;

public class ConfigChangeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_change);
    }

    /**
    不能和restore 一起用
     而且要在activity 里面添加：android:configChanges="keyboard|orientation|screenSize"
     */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

       if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
           //Toast.makeText(this,"横屏了",Toast.LENGTH_SHORT).show();
       }else{
           //Toast.makeText(this,"竖屏了",Toast.LENGTH_SHORT).show();
       }

    }


    /**
     *
     * @param savedInstanceState
     * @param persistentState
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Toast.makeText(this,"onRestoreState",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void findView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setOnClick() {

    }
}

package seven.team.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import seven.team.util.BaseActivity;
import android.os.Bundle;
import seven.team.util.UsualIntent;

public class GoodsManageActivity extends BaseActivity implements View.OnClickListener {
    private ImageView returnFormer;
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_manage);
        bindData();
    }
    private void bindData(){
        returnFormer = findViewById(R.id.return_former);
        title = findViewById(R.id.title);
        title.setText("商品管理");
        returnFormer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.return_former:
                UsualIntent.toAnotherPage("MainActivity");
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

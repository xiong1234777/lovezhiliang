package com.tb.lovezhiliang;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import comm.BaseActivity;
import comm.CommonAdapter;
import comm.ViewHolder;

/**
 * Created by zxh on 2016/5/25.
 */
public class FunctionActivity extends BaseActivity {




  @Bind(R.id.gv_content)
  GridView mGvContent;

  @Override
  protected void onCreate(Bundle arg0) {
    super.onCreate(arg0);
    this.setContentView(R.layout.activity_function);
    ButterKnife.bind(this);


    List<IconInfo> list = new ArrayList<>();


    IconInfo info  = new IconInfo("测试",R.drawable.a1);
    IconInfo info1 = new IconInfo("投诉",R.drawable.a2);
    IconInfo info2 = new IconInfo("分类",R.drawable.a3);
    IconInfo info3 = new IconInfo("质量",R.drawable.a4);
    IconInfo info4 = new IconInfo("生活",R.drawable.a5);
    IconInfo info5 = new IconInfo("设置",R.drawable.a7);

    list.add(info);
    list.add(info1);
    list.add(info2);
    list.add(info3);
    list.add(info4);
    list.add(info5);

    list.add(info);
    list.add(info1);
    list.add(info2);
    list.add(info3);
    list.add(info4);
    list.add(info5);

    list.add(info);
    list.add(info1);
    list.add(info2);
    list.add(info3);
    list.add(info4);
    list.add(info5);



    mGvContent.setAdapter(new CommonAdapter<IconInfo>(this,list,R.layout.adapter_function_gv) {

      @TargetApi(Build.VERSION_CODES.LOLLIPOP)
      @Override
      public void convert(ViewHolder helper, IconInfo item) {
          helper.setText(R.id.tv,item.name);
        ImageView iv = helper.getView(R.id.iv);
        iv.setImageResource(item.drawble);
      }
    });

  }


}

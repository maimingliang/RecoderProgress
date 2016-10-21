# RecoderProgress


#简介

仿微信录制小视频 进度条


![这里写图片描述](https://github.com/maimingliang/RecoderProgress/blob/master/progress.gif)

#使用


```code

  <com.maiml.recoderprogressdemo.widget.RecoderProgress
         app:max_recoder_time="10000"
         app:min_recoder_time="2000"
         app:af_progress_color="@color/colorPrimaryDark"
         app:bf_progress_color="@color/colorAccent"
         android:id="@+id/recodrProgress"
         android:layout_centerInParent="true"
         android:layout_width="match_parent"
         android:layout_height="2dp" />

```

#配置参数

|name|format|description|
|:---:|:---:|:---:|
| max_recoder_time| integer |录制的最长时间
| min_recoder_time| integer |录制的最短时间
| bf_progress_color| integer|Progress小于录制最短时间的颜色
| af_progress_color| integer|Progress大于录制最短时间的颜色


#关于我

[简书maimingliang](http://www.jianshu.com/users/141bda5f1c5c/latest_articles)

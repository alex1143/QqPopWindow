package com.dxkj.testdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;

/**
 * 图片异步任务
 * Created by dxkj on 2015/12/17.
 */
public class ImageAsyncTask extends AsyncTask<String, Integer, Bitmap> {

    private Context context;
    private ImageCallBack callBack;

    public ImageAsyncTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    /**
     * 后台任务
     *
     * @param params
     * @return
     */
    @Override
    protected Bitmap doInBackground(String... params) {
        return null;
    }

    /**
     * 更新进度框
     *
     * @param values
     */
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    /**
     * 返回结果
     *
     * @param bitmap
     */
    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
    }

    public interface ImageCallBack {
        public void send(Bitmap bitmap);
    }
}

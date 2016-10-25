package kr.hs.emirim.young24.gallerytest;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery gallery;
    ImageView imgMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gallery=(Gallery)findViewById(R.id.gallery_1);
        imgMain = (ImageView)findViewById(R.id.imgv_main);
        MyGalleryAdapter adapter = new MyGalleryAdapter(this);
        gallery.setAdapter(adapter);
    }

    public class MyGalleryAdapter extends BaseAdapter{
        Context context;
        int [] charcters = {R.drawable.poo_1, R.drawable.phoo_3, R.drawable.moomin_1,R.drawable.moomin_2,R.drawable.moomin_3,R.drawable.kakao_1,R.drawable.kakao_2,R.drawable.kakao_3,R.drawable.insideout_1,R.drawable.insideout_2};
        public MyGalleryAdapter(Context context){
            this.context = context;
        }
        public int getCount(){
            return charcters.length;
        }
        public View getView(int position, View converView, ViewGroup parent){
            ImageView imgV = new ImageView(context);
            imgV.setLayoutParams(new Gallery.LayoutParams(100, 150));
            imgV.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imgV.setPadding(5,5,5,5);
            imgV.setImageResource(charcters[position]);
            return imgV;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }
    }
}

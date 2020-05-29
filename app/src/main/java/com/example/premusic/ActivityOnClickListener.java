package com.example.premusic;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.view.View;

public class ActivityOnClickListener implements View.OnClickListener {
    private Class _class;

    public ActivityOnClickListener(Class _class){
        this._class=_class;
    }

    @Override
    public void onClick(View v) {
        Context context = v.getContext();
        Intent intent = new Intent(context,this._class);
        context.startActivity(intent);
    }
}

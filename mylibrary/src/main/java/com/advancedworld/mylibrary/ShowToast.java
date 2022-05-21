package com.advancedworld.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {
    public static void showToast(Context c, String msg){
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }
}

package com.haocang.bjxjc.ui.user.view;


import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Gool Lee
 */
@SuppressLint("AppCompatCustomView")
public class MarqueTextView extends TextView {

	public MarqueTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public MarqueTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MarqueTextView(Context context) {
		super(context);
	}

	@Override
	public boolean isFocused() {
		return true;
	}
}
package com.example.touch;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;


public class TouchImageViewActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TouchImageView img = (TouchImageView) findViewById(R.id.snoop);
        /*img.setImageResource(R.raw.strokes_png);
        img.setMaxZoom(4f);*/
        
        int white = Integer.parseInt("FFFFFF", 16);
     
        int red = Integer.parseInt("FF0000", 16);
        
        SVG svg = SVGParser.getSVGFromResource(getResources(), R.raw.snoopy2);
        
        Drawable svgDrawable = svg.createPictureDrawable();
        img.setImageDrawable(svgDrawable);
        img.setMaxZoom(100f);
    }
}
package edu.udayton.techgadget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.HttpRetryException;

public class PictureActivity extends AppCompatActivity {

    public static final String ID_KEY = "RES_ID";
    public static final String LABEL_KEY = "LABEL";
    public static final String BUTTON_KEY = "BUTTON";
    public static final String URL_KEY = "URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        Intent myIntent = getIntent();
        Bundle myExtras = myIntent.getExtras();
        Button pictureButton = (Button)findViewById(R.id.pictureBtn);

        if(myExtras!=null){
            String res_label = myExtras.getString(LABEL_KEY);
            final TextView pictureTextView = (TextView)findViewById(R.id.pictureTextView);
            pictureTextView.setText(res_label);

            String image_id = myExtras.getString(ID_KEY);
            int imageId = Integer.parseInt(image_id);
            final ImageView pictureImageView = (ImageView)findViewById(R.id.pictureImageView);
            pictureImageView.setImageResource(imageId);
            pictureImageView.setContentDescription(res_label);

            String btn_label = myExtras.getString(BUTTON_KEY);
            final Button buttonText = (Button)findViewById(R.id.pictureBtn);
            buttonText.setText(btn_label);

            final String url_label = myExtras.getString(URL_KEY);


            View.OnClickListener pictureButtonListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent uriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url_label));
                    startActivity(uriIntent);
                }
            };
            pictureButton.setOnClickListener(pictureButtonListener);
        }
    }
}

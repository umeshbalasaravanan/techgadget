package edu.udayton.techgadget;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class GadgetActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<String>  attractions = Arrays.asList(getResources().getStringArray(R.array.attraction));
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_gadget, R.id.gadgetTextView, attractions));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        Intent intent;
        switch (position){
            case 0:
                intent = new Intent(GadgetActivity.this, PictureActivity.class);
                intent.putExtra(PictureActivity.LABEL_KEY, getResources().getString(R.string.macbookProTextVal));
                intent.putExtra(PictureActivity.ID_KEY, Integer.toString(R.drawable.macbook_pro));
                intent.putExtra(PictureActivity.BUTTON_KEY, getResources().getString(R.string.btnVal));
                intent.putExtra(PictureActivity.URL_KEY, getResources().getString(R.string.macbookProUrlVal));
                break;
            case 1:
                intent = new Intent(GadgetActivity.this, PictureActivity.class);
                intent.putExtra(PictureActivity.LABEL_KEY, getResources().getString(R.string.iphoneElevenTextVal));
                intent.putExtra(PictureActivity.ID_KEY, Integer.toString(R.drawable.ipbone_eleven));
                intent.putExtra(PictureActivity.BUTTON_KEY, getResources().getString(R.string.btnVal));
                intent.putExtra(PictureActivity.URL_KEY, getResources().getString(R.string.iphoneElevenUrlVal));
                break;
            case 2:
                intent = new Intent(GadgetActivity.this, PictureActivity.class);
                intent.putExtra(PictureActivity.LABEL_KEY, getResources().getString(R.string.iphoneElevenProTextVal));
                intent.putExtra(PictureActivity.ID_KEY, Integer.toString(R.drawable.iphone_eleven_pro));
                intent.putExtra(PictureActivity.BUTTON_KEY, getResources().getString(R.string.btnVal));
                intent.putExtra(PictureActivity.URL_KEY, getResources().getString(R.string.iphoneElevenProUrlVal));
                break;
            case 3:
                intent = new Intent(GadgetActivity.this, PictureActivity.class);
                intent.putExtra(PictureActivity.LABEL_KEY, getResources().getString(R.string.ipadProTextVal));
                intent.putExtra(PictureActivity.ID_KEY, Integer.toString(R.drawable.ipad_pro));
                intent.putExtra(PictureActivity.BUTTON_KEY, getResources().getString(R.string.btnVal));
                intent.putExtra(PictureActivity.URL_KEY, getResources().getString(R.string.ipadProUrlVal));
                break;
            case 4:
                intent = new Intent(GadgetActivity.this, PictureActivity.class);
                intent.putExtra(PictureActivity.LABEL_KEY, getResources().getString(R.string.airPodsProTextVal));
                intent.putExtra(PictureActivity.ID_KEY, Integer.toString(R.drawable.airpods_pro));
                intent.putExtra(PictureActivity.BUTTON_KEY, getResources().getString(R.string.btnVal));
                intent.putExtra(PictureActivity.URL_KEY, getResources().getString(R.string.airPodsProUrlVal));
                break;
            default:
                Toast myToast = Toast.makeText(GadgetActivity.this, "Invalid choice made", Toast.LENGTH_LONG);
                myToast.show();
                intent = null;
                break;

        }
        if(intent != null){
            startActivity(intent);
        }
    }
}

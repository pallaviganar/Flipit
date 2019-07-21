package app.pallavisumit.com.flipit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class play extends AppCompatActivity {
    ArrayList<Integer> data = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        TableLayout tl = findViewById(R.id.tl_id);
        int[] array = new int[]{1, 2, 4, 5, 6, 78, 8, 65, 54};
        //  TableView<array> table =

        int flag = 1;
        for(int i = 0; i < array.length; i++) {

            TableRow tableRow = new TableRow(play.this);
            String msg = Integer.toString(array[i]);
            TextView textView = findViewById(R.id.tv_id1);
            textView.setText(msg);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            tl.addView(tableRow);

        }
  /*  public void flip(){
        Toast.makeText(play.this,"You clicked",Toast.LENGTH_LONG).show();
    }*/

    }
}
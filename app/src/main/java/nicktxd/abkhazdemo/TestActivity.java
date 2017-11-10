package nicktxd.abkhazdemo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


/**
 * Created by gerewget on 10.11.2017.
 */

public class TestActivity extends Activity {
    EditText testText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        testText = findViewById(R.id.testText);

        GetRawData.getHandler(mhandler);
        final Button testButton = findViewById(R.id.testButton);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetRawData gt1 = new GetRawData();
                gt1.getAllData();
            }
        });
    }

    @SuppressLint("HandlerLeak")
    Handler mhandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == 1){
                String alldata = (String) msg.obj;
                ParseRawData parseRawData = new ParseRawData();
                ArrayList<Vacancy> list = parseRawData.getVacancies(alldata);
                testText.setText(list.get(0).getCity());
            }
        }
    };

}

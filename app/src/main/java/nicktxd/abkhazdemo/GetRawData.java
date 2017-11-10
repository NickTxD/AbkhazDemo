package nicktxd.abkhazdemo;


import android.os.Handler;
import android.widget.Toast;

import java.io.IOException;

import javax.security.auth.callback.Callback;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetRawData{

    public static void getHandler(Handler handler){
        mhandler = handler;
    }
    static Handler mhandler = new Handler();
    
    void getAllData(){
        final String[] result = new String[1];
        String url = "https://abkhaz-rabota.ru/listall";

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();


        client.newCall(request).enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                call.cancel();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    result[0] = response.body().string();
                    mhandler.obtainMessage(1, result[0]).sendToTarget();
                }

            }
        });
    }
}

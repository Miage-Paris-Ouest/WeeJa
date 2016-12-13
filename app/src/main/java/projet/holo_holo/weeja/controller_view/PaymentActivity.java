package projet.holo_holo.weeja.controller_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.paymill.android.factory.*;
import com.paymill.android.listener.*;
import com.paymill.android.service.*;

import projet.holo_holo.weeja.R;

public class PaymentActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        //PMManager.init(getApplicationContext(), PMService.ServiceMode.TEST, "yourpublickey",null, null);
        //²²²PMManager.addListener(listener);
    }
    PMGenerateTokenListener listener = new PMGenerateTokenListener() {
        public void onGenerateTokenFailed(PMError error) {
            Log.e("PM", "Error:" + error.toString());
        }

        public void onGenerateToken(String token) {
            Log.d("PM", "Token:" + token);
        }
    };

    public void test() {
        // the payment method ( cc or dd data)
        PMPaymentMethod method = PMFactory.genCardPayment("Max Mustermann", "4111111111111111", "12", "2015", "1234");
        // the payment parameters (currency, amount, description)
        PMPaymentParams params = PMFactory.genPaymentParams("EUR", 100, null);

        PMManager.generateToken(getApplicationContext(), method, params, PMService.ServiceMode.TEST, "yourpublickey");

        PMManager.addListener(listener);
        // trigger the transaction
        PMManager.transaction(getApplicationContext(), method, params, false);
    }

    protected void onDestroy() {
        super.onDestroy();
        PMManager.removeListener(listener);
    }
}

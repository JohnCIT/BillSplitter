package spinky.billsplitter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;

import spinky.billsplitter.bill.Bill;
import spinky.billsplitter.controllers.MainViewController;

public class MainActivity extends AppCompatActivity {

    MainViewController _mainViewController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create the main controller.
        _mainViewController = new MainViewController();

        final Button button = (Button) findViewById(R.id.createBillButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Connect to web service and save data.

                // For now we will keep everything in memory. Gather the details and create the Bill
                _mainViewController.createNewBill();
                System.out.println("Bill Created...");

                ArrayList<Bill> bills = _mainViewController.getListOfBills();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

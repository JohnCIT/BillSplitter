package spinky.billsplitter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import spinky.billsplitter.bill.Bill;
import spinky.billsplitter.controllers.MainViewController;
import spinky.billsplitter.toast.ToastMessage;

public class MainActivity extends AppCompatActivity {

    MainViewController _mainViewController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Set up toast message

        // Create the main controller.
        _mainViewController = new MainViewController();

        final Button createBillButton = (Button) findViewById(R.id.createBillButton);
        createBillButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Start the intent
                Intent intent = new Intent(MainActivity.this, CreateBillActivity.class);
                startActivity(intent);
            }
        });


        final Button viewBillButton = (Button) findViewById(R.id.viewBillsButton);
        viewBillButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewBillsActivity.class);
                startActivity(intent);
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

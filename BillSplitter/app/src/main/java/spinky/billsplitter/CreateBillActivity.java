package spinky.billsplitter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import spinky.billsplitter.controllers.MainViewController;
import spinky.billsplitter.toast.ToastMessage;

public class CreateBillActivity extends AppCompatActivity {

    MainViewController _mainViewController;
    ToastMessage _toastMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_bill);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Set up toast messages
        _toastMessage = new ToastMessage(getApplicationContext());

        // Create the main controller.
        _mainViewController = new MainViewController();

        // Get the add bill button
        final Button addBillButton = (Button) findViewById(R.id.addBillButton);
        addBillButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Create the main controller.
                _mainViewController = new MainViewController();

                // Gather the data
                final EditText billNameInput = (EditText) findViewById(R.id.billNameInput);
                final EditText billDescriptionInput = (EditText) findViewById(R.id.billDesc);
                // TODO Bill due date
                final EditText billAmountInput = (EditText) findViewById(R.id.billAmountInput);

                String billName = billNameInput.getText().toString();
                String billDesc = billDescriptionInput.getText().toString();
                String billAmount = billAmountInput.getText().toString();

                // Create the bill
                _mainViewController.createNewBill(billName, billDesc, billAmount);

                // Tell the user a bill has been created
                _toastMessage.createToastMessage(getString(R.string.createdBillToast));
                finish();
            }
        });

    }
}

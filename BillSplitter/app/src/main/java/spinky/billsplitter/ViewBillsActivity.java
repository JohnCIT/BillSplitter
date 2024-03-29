package spinky.billsplitter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import spinky.billsplitter.bill.Bill;
import spinky.billsplitter.customui.BillAdapter;
import spinky.billsplitter.userAccount.LocalAccount;

public class ViewBillsActivity extends AppCompatActivity {

    static final String[] FRUITS = new String[] { "Apple", "Avocado", "Banana",
            "Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit",
            "Jackfruit", "Mango", "Olive", "Pear", "Sugar-apple" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_bills);

        ListView billsList = (ListView) findViewById(R.id.billListView);
        TextView textView = (TextView) findViewById(R.id.textView);

        BillAdapter adapter = new BillAdapter(this, R.id.textView, LocalAccount.getInstance().getListOfBills());

        billsList.setAdapter(adapter);

    }
}

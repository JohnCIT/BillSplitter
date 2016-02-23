package spinky.billsplitter.customui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import spinky.billsplitter.R;
import spinky.billsplitter.bill.Bill;
import spinky.billsplitter.userAccount.LocalAccount;

public class BillAdapter extends ArrayAdapter<Bill> {

    public BillAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public BillAdapter(Context context, int resource, List<Bill> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_view_bills, null);
        }

        Bill bill = getItem(position);

        if (bill != null) {
            TextView tt1 = (TextView) v.findViewById(R.id.textView);
            TextView tt2 = (TextView) v.findViewById(R.id.billDesc);
            TextView tt3 = (TextView) v.findViewById(R.id.billDate);

            if (tt1 != null) {
                tt1.setText(bill.getBillName());
            }

            if (tt2 != null) {
                tt2.setText(bill.getBillDescription());
            }

            if (tt3 != null) {
                tt3.setText(bill.getBillAmount().toString());
            }
        }

        return v;
    }

}
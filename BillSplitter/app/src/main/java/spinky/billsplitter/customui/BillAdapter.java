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
        View view = convertView;

        if (view == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            view = vi.inflate(R.layout.activity_view_bills, null);
        }

        Bill bill = getItem(position);

        if (bill != null) {
            TextView billName = (TextView) view.findViewById(R.id.textView);
            TextView billDesc = (TextView) view.findViewById(R.id.billDesc);
            TextView billDate = (TextView) view.findViewById(R.id.billDate);

            if (billName != null) {
                billName.setText(bill.getBillName());
            }

            if (billDesc != null) {
                billDesc.setText(bill.getBillDescription());
            }

            if (billDate != null) {
                billDate.setText(bill.getBillAmount().toString());
            }
        }

        return view;
    }
}
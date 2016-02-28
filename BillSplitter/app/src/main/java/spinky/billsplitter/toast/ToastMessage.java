package spinky.billsplitter.toast;

import android.content.Context;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by John on 27/02/2016.
 */
public class ToastMessage {

    Context _context;

    public ToastMessage(Context context)
    {
        _context = context;
    }


    /**
     * Create a toast message
     * @param text
     *      The message to display
     */
    public void createToastMessage(String text)
    {
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(_context, text, duration);
        toast.show();
    }


}

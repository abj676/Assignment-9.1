package c.menuitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// Text View declaration for color change
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Text view initilization
        textView=findViewById(R.id.textview);
    }
//creating option menu item
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.meniitem,menu);
        return super.onCreateOptionsMenu(menu);
    }
//Setting function on select of option menu item
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
//colour red to text
            case R.id.red:
                textView.setTextColor(getResources().getColor(R.color.red));
                break;
//colour green to text

            case R.id.green:
                textView.setTextColor(getResources().getColor(R.color.green));
                break;
//colour blue to text

            case R.id.blue:
                textView.setTextColor(getResources().getColor(R.color.blue));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

package badran.ibraheem.ibraheemtaskslists;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        //koko wawa
    }

    @Override//بناء القائمه
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override //معالجة حدث اختيار عنصر من القائمة
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()==R.id.itmSettings)
        {
        }
        if(item.getItemId()==R.id.itmSignOut)
        {
        }
        return true;
    }

    /**
     * داله مساعده لفتح قائمه تتلقى بارمتر للكائن الذي سبب فتح القائمه
     * @param v
     */
    public void showPopUpMenu(View v)
    {
        PopupMenu popup=new PopupMenu(this,v);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    public void onClick(View v){
        showPopUpMenu(v);}









}
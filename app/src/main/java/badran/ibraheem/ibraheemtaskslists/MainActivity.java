package badran.ibraheem.ibraheemtaskslists;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import badran.ibraheem.ibraheemtaskslists.data.mytasksTable.MyTask;

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
    public void showPopUpMenu(View v){
        PopupMenu popup=new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    public void onClick(View v){
        showPopUpMenu(v);
    }

/**
 دالة مساعدة لفتح قائمة تتلقى *
 بارمترا للكائن الذي سبب فتح القائمة *
 * @param v
 * @param item
 */
    public void showPopUpMenu(View v, MyTask item)
    {
        // popup menu بناء قائمة
        PopupMenu popup = new PopupMenu(this, v);//الكائن الذي سبب فتح القائمه v
       // ملف القائمة
        popup.inflate(R.menu.popup_menu);
        //اضافة معالج حدث لاختيار عنصر من القائمة
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                if(menuItem.getItemId()==R.id.itmComplete){
                   Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT).show();
                       Intent i=new Intent(MainActivity.this,AddTaskActivity.class);
                   startActivity(i);
                }
                if(menuItem.getItemId()==R.id.itmDelete){
                     Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT).show();
                }
                if(menuItem.getItemId()==R.id.itmEdit) {
                    Toast.makeText(MainActivity.this, "Edit", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        popup.show();//فتح وعرض القائمه
    }









}
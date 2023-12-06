package badran.ibraheem.ibraheemtaskslists.data;


/*
تعريف الجداول وقم الاصدار
version
عند تغيير اي شيء يخص جدول او دوال علينا تغيير رقم الاصدار يتم بناء قاعدة البيانات من جديد
 */

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import badran.ibraheem.ibraheemtaskslists.data.mySubjectTable.MySubject;
import badran.ibraheem.ibraheemtaskslists.data.mySubjectTable.MySubjectQuery;
import badran.ibraheem.ibraheemtaskslists.data.mytasksTable.MyTask;
import badran.ibraheem.ibraheemtaskslists.data.mytasksTable.MyTaskQuery;
import badran.ibraheem.ibraheemtaskslists.data.usersTable.MyUser;
import badran.ibraheem.ibraheemtaskslists.data.usersTable.MyUserQuery;



@Database(entities = {MyUser.class, MySubject.class, MyTask.class}, version =1)
/**
 الفئة المسؤولة عن بناء قاعدة البايانات بكل جداولها *
 وتوفر لنا كائن للتعامل مع قاعدة البيانات *
 */
public abstract class AppDataBase extends RoomDatabase{
    /**
     كائن للتعامل مع قاعدة البيانات *
     */
    private static AppDataBase db; /**
     يعيد كائن لعمليات جدول المستعملين *
     * @return
     */

    public abstract MyUserQuery getMyUserQuery();
/**
 يعيد كائن لعمليات جدول الموضيع *
 * @return
 */

    public abstract MySubjectQuery getMySubjectQuery();
    /**
     يعيد كائن لعمليات جدول المهمات *
     * @return
     */

    public abstract MyTaskQuery getMyTaskQuery();

    /**
     بناء قاعدة البيانات واعادة كائن يؤشر عليها *
    * @param context
      * @return
     */
    public static AppDataBase getDB(Context context){
     if(db==null)
     {
    db = Room.databaseBuilder(context,
    AppDataBase.class,
          "ibraheemDataBase")//اسم قاعدة البيانات
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build();
}
return db;

        }
}


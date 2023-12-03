package badran.ibraheem.ibraheemtaskslists.data;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import badran.ibraheem.ibraheemtaskslists.data.usersTable.MyUser;

/*
تعريف الجداول ورقم الاصدار
version
عند تغيير اي شي يخص جدول او جداول علينا تغيير رقم الاصدار
ليتم بناء قاعدة البيانات من جديد
*/
@Database(entities = {MyUser.class, MySubject.class, MyTask.class},version = 1)
/**
 * الفئة المسؤولة عن بناء قاعدة البايانات بكل جداولها
 * وتوفر لنا كائن للتعامل مع قاعدة البيانات
 */

public class AppDatabase extends RoomDatabase {

    /**
     * كائن للتعامل مع قاعدة البيانات
     */
    private static AppDataBase db;

    /**
     * يعيد كائن لعمليات جدول المستعملين
     * @return
     */
    public abstract MyUserQuery getMyUserQuery();

    /**
     * يعيد كائن لعمليات جدول الموضيع
     * @return
     */
    public abstract MySubjectQuery getMySubjectQuery();

    /**
     * يعيد كائن لعمليات جدول المهمات
     * @return
     */
    public abstract MyTaskQuery getMyTaskQuery();

    /**
     * بناء قاعدة البيانات واعادة كائن يؤشر عليها
     * @param context
     * @return
     */
    public static AppDataBase getDB(Context context)
    {
        if(db==null)
        {
            db = Room.databaseBuilder(context,
                            AppDataBase.class,
                            "samihDataBase")//اسم قاعدة اليانات
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return db;
    }

}

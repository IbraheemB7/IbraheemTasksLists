package badran.ibraheem.ibraheemtaskslists.data;


/*
 */

import androidx.room.RoomDatabase;

import badran.ibraheem.ibraheemtaskslists.data.mySubjectTable.MySubjectQuery;
import badran.ibraheem.ibraheemtaskslists.data.mytasksTable.MyTaskQuery;
import badran.ibraheem.ibraheemtaskslists.data.usersTable.MyUserQuery;

/**
 تعريف الجداول ورقم الاصدار
 version
 عند تغيير اي شي يخص جدول او داول علينا تغيير رقم الاصدار يتم بناء قاعدة البيانات من جديد
 @Database(entities = {MyUser.class, MySubject.class, MyTask.class}, version =1)
 الفئة المسؤولة عن بناء قاعدة البايانات بكل جداولها *
 وتوفر لنا كائن للتعامل مع قاعدة البيانات *
 */
public abstract class AppDataBase extends RoomDatabase {
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
@
    public abstract MySubjectQuery getMySubjectQuery(); /**
     يعيد كائن لعمليات جدول المهمات *
     * @return
     */

    public abstract MyTaskQuery getMyTaskQuery();



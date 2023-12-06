package badran.ibraheem.ibraheemtaskslists.data.mytasksTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;


/**
 واجهة استعلامات على جدول معطيات *
 */
@Dao
public interface MyTaskQuery {
    /**
     اعادة جميع معطيات جدول المهمات * قائمة من المهمات * return@ *
     */
    @Query("SELECT * FROM MyTask ORDER BY importance DESC") List<MyTask> getAllTasks();
/**
 ارجاع المهمات حسب المستعمل واذا انتهت ام لا ومرتبة تنازليا حسب الاهمية  *
 * رقم المستعمل * param isCompleted_p@
 * @return
*/
    @Query("SELECT * FROM MyTask WHERE userId=:userid_p " + "ORDER BY time DESC")
    List<MyTask> getAllTaskOrederBy(long userid_p);
    /**
     ارجاع المهمات حسب المستعمل واذا انتهت ام لا ومرتبة تنازليا حسب الاهمية *
     رقم المستعمل *param userid_p@
     *
     هل تمت ام لا * param isCompleted_p@ *
     قائمة مهمات * return@
     */
    @Query("SELECT * FROM MyTask WHERE userId=:userid_p AND isCompleted=:isCompleted_p "+
 "ORDER BY importance DESC")
    List<MyTask> getAllTaskOrederBy(long userid_p, boolean isCompleted_p);

    /**
     ادخال مهمات *
     مجموعة مهمات * param t@
     */
    @Insert
/**
 *
 ثلاثة نقاط تعني مجموهة // ;(void insertTask(MyTask... (t
 تعديل المهعمات
 مجموعة مهمات للتعديل التعديل حسب المفتاح الرئيسي) * param tasks@
 */
    @Update
    void updateTask(MyTask... tasks);
    /**
     *
     حذفق مهمة او مهمات :
     حذف المهمات (حسب المفتاح الرئيسي) * param tasks@
     */
    @Delete
    void deleteTask(MyTask...tasks);
    @Query("DELETE FROM MyTask WHERE keyId=:kid")
    void deleteTask(long kid);

/**
 }
 استخراج جميع المهمات التابعة لرقم الموضوع *
 رقم الموضوع param key_id@
 *@return
 */

    @Query("SELECT * FROM MyTask WHERE subjId=:key_id " +
            "ORDER BY importance DESC")
    List<MyTask> getTasksBySubjld(long key_id);





}
package badran.ibraheem.ibraheemtaskslists.data.mySubjectTable;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MySubjectQuery { /**
 }
 اعادة جميع معطيات جدول المواضيع * قائمة من المواضيع * return@ *
 */
@Query("SELECT * FROM MySubject")
List<MySubject> getAllSubjects();
    /**
     ادخال مهمات *
     * @param s *lafs Äp gapa
     */
    @Insert
    void insert(MySubject...s); //ası çixi blái ätti
    /**
     تعديل المهعمات *
     * @param s @Update
    void update(MySubject... s);
    /**
    حذفق مهمة او مهمات *
    حذف المهمات حسب المفتاح الرئيسي) * params@ *
     */
    @Delete
    void deleteTask(MySubject...s);
    @Query("DELETE FROM MySubject WHERE key_id=:keyid") void delete(long keyid);
    @Query("SELECT * From MySubject WHERE title=:sub") MySubject checkSubject(String sub);
}
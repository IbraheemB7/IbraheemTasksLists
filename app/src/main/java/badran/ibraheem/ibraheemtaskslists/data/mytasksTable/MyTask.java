package badran.ibraheem.ibraheemtaskslists.data.mytasksTable;

import androidx.room.Entity;

@Entity
public class MyTask {
    /**رقم المهمه*/
    public long keyId;
    /**درجة الاهميه 1-5 */
    public int importance;
    /**عنوان قصير */
    public String shortTitle;
    /** نص المهمه*/
    public String text;
    /** زمن بناء المهمه*/
    public long time;
    /** هل تمت المهمه*/
    public boolean isCompleted;
    /** رقم موضوع المهمه*/
    public long subjId;
    /** رقم المستعمل الذي اضاف المهمه*/
    public long userId;

    public long getKeyId() {
        return keyId;
    }

    public int getImportance() {
        return importance;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public String getText() {
        return text;
    }

    public long getTime() {
        return time;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public long getSubjId() {
        return subjId;
    }

    public long getUserId() {
        return userId;
    }

    public void setKeyId(long keyId) {
        this.keyId = keyId;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setSubjId(long subjId) {
        this.subjId = subjId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}

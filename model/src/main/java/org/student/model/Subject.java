package org.student.model;

import org.aten.db.ann.MyTable;
import org.aten.db.ann.TableId;

/**
 * Create by lorenzo on 17-12-28.
 */
@MyTable("SUBJECT_INFO")
public class Subject {

    @TableId
    private int subId;

    private String subjectName;

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}

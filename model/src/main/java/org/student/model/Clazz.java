package org.student.model;

import org.aten.db.ann.MyTable;
import org.aten.db.ann.TableId;

/**
 * Create by lorenzo on 17-12-28.
 */
@MyTable("CLASS_INFO")
public class Clazz {

    @TableId
    private int classId;

    private String className;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

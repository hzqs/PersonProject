package org.student.dao.impl;

import org.aten.beans.ann.Component;
import org.aten.db.helper.handler.BeanHandler;
import org.aten.db.helper.handler.BeanListHandler;
import org.student.dao.BeanDao;
import org.student.dao.PublicDao;
import org.student.dto.StudentDto;

import java.util.List;

/**
 * Create by lorenzo on 17-12-28.
 */
@Component
public class StudentDtoDao extends PublicDao implements BeanDao<StudentDto>{

    @Override
    public StudentDto query(StudentDto studentDto) {
        String sql = "SELECT * FROM STUDENT_INFO S " +
                "JOIN SUBJECT_INFO SI ON S.SUB_ID=SI.SUB_ID " +
                "JOIN CLASS_INFO C ON S.CLASS_ID=C.CLASS_ID WHERE S.STU_ID=?";
        return getCurrentSqlExecutor()
                .executeQuery(sql,new BeanHandler<>(StudentDto.class),studentDto.getStuId());
    }

    @Override
    public List<StudentDto> queryList() {
        String sql = "SELECT * FROM STUDENT_INFO S " +
                "JOIN SUBJECT_INFO SI ON S.SUB_ID=SI.SUB_ID " +
                "JOIN CLASS_INFO C ON S.CLASS_ID=C.CLASS_ID;";
        return getCurrentSqlExecutor().executeQuery(sql, new BeanListHandler<>(StudentDto.class));
    }


}

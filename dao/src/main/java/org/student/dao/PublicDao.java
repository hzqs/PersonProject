package org.student.dao;

import org.aten.db.helper.SQLExecutor;
import org.aten.db.tool.impl.MySqlTableBuilder;
import org.student.util.DBConn;

/**
 * Create by lorenzo on 17-12-28.
 */
public class PublicDao {

    protected SQLExecutor getCurrentSqlExecutor(){
        return SQLExecutorContext.getCurrentSQLExecutor();
    }

    protected SQLExecutor getSqlExecutor(){
        return new SQLExecutor(DBConn.getConnection());
    }

    public void createTable(Class<?> clazz){
        getCurrentSqlExecutor()
                .executeUpdate(new MySqlTableBuilder().getCreateTableStatement(clazz));
    }
}

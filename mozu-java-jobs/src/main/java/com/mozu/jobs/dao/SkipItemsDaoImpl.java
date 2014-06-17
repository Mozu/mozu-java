/*
 * COPYRIGHT (C) 2014 Volusion Inc. All Rights Reserved.
 */
package com.mozu.jobs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.repository.dao.AbstractJdbcBatchMetadataDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import com.mozu.jobs.models.SkipItems;

public class SkipItemsDaoImpl extends AbstractJdbcBatchMetadataDao implements SkipItemsDao {
    private DataSource dataSource;

    private final String insertStatement= "INSERT INTO SKIP_ITEMS (type, item, msg,runId,jobExecutionId,stepExecutionId, jobName ) VALUES(?,?,?,?,?,?,?)";
    private final String deleteStatement= "DELETE FROM SKIP_ITEMS WHERE id=?";
    private final String selectByJobIds = "SELECT * FROM SKIP_ITEMS WHERE jobExecutionId = ?";
    
    public SkipItemsDaoImpl () {
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        setJdbcTemplate(new JdbcTemplate(dataSource));
    }

    public void save(SkipItems skipElement){
        getJdbcTemplate().update(insertStatement, new Object[]{skipElement.getType(), skipElement.getItem(), skipElement.getMsg(), skipElement.getRunId(), skipElement.getJobExecutionId(), skipElement.getStepExecutionId(), skipElement.getJobName()});
    }
 

    @Override
    public List<SkipItems> getByJobExecutionId(Long jobExecutionId) {
        return getJdbcTemplate().query(selectByJobIds, new Object[] {jobExecutionId}, new SkipItemsRowMapper());

    }

    @Override
    public void delete(Long id) {
        getJdbcTemplate().update(deleteStatement, id);
    }
    
    /**
     * Re-usable mapper for {@link JobExecution} instances.
     *
     * @author Dave Syer
     *
     */
    private final class SkipItemsRowMapper implements ParameterizedRowMapper<SkipItems> {
        public SkipItemsRowMapper() {
        }

        @Override
        public SkipItems mapRow(ResultSet rs, int rowNum) throws SQLException {
            Long id = rs.getLong(1);
            SkipItems skipItems = new SkipItems();
            skipItems.setId(id);
            skipItems.setJobExecutionId(rs.getLong(2));
            skipItems.setStepExecutionId(rs.getLong(3));
            skipItems.setJobName(rs.getString(4));
            skipItems.setType(rs.getString(5));
            skipItems.setItem(rs.getString(6));
            skipItems.setMsg(rs.getString(7));
            skipItems.setRunId(rs.getLong(8));
            return skipItems;
        }

    }
}

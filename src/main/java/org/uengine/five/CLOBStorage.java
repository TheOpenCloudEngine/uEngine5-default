package org.uengine.five;

import org.uengine.modeling.resource.IContainer;
import org.uengine.modeling.resource.IResource;
import org.uengine.modeling.resource.Storage;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by uengine on 2017. 11. 9..
 */
public class CLOBStorage implements Storage{

    DataSource dataSource;
        public DataSource getDataSource() {
            return dataSource;
        }

        public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
        }

    String tableName;
        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }



    @Override
    public void delete(IResource iResource) throws IOException {
    }

    @Override
    public void rename(IResource iResource, String s) {

    }

    @Override
    public void copy(IResource iResource, String s) throws Exception {

    }

    @Override
    public void move(IResource iResource, IContainer iContainer) throws IOException {

    }

    @Override
    public List<IResource> listFiles(IContainer iContainer) throws Exception {

            //DB table 의 CLOB 에 있는 파일 ㄹ리스트를 리턴
        return null;
    }

    @Override
    public void createFolder(IContainer iContainer) throws Exception {

    }

    @Override
    public boolean exists(IResource iResource) throws Exception {
        return false;
    }

    @Override
    public Object getObject(IResource iResource) throws Exception {
        return null;
    }

    @Override
    public void save(IResource iResource, Object o) throws Exception {

    }

    @Override
    public InputStream getInputStream(IResource iResource) throws Exception {
        return null;
    }

    @Override
    public OutputStream getOutputStream(IResource iResource) throws Exception {
        return null;
    }

    @Override
    public boolean isContainer(IResource iResource) throws Exception {
        return false;
    }
}

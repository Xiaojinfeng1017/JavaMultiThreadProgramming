package Chapter3.wait_notify_insert_test;

/**
 * @ClassName BackupA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/19 16:34
 */
public class BackupB extends Thread {

    private DBTools dbTools;
    public BackupB(DBTools dbTools){
        this.dbTools = dbTools;
    }
    @Override
    public void run() {
        dbTools.backupB();
    }
}

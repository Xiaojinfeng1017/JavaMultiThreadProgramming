package Chapter3.wait_notify_insert_test;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/19 16:36
 */
public class Run {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for(int i=0; i<10; i++){
            BackupA backupA = new BackupA(dbTools);
            BackupB backupB = new BackupB(dbTools);
            backupA.start();
            backupB.start();
        }
    }
}

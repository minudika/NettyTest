import java.util.ArrayList;

/**
 * Created by minudika on 2/18/16.
 */
public class DataHolder {
    public static ArrayList events=new ArrayList<Object>();
    public static int count =0;
    static{
        events.add(new Object[]{"ticket1","2016-01-01","12:12:12",123.23});
        events.add(new Object[]{"ticket2","2016-01-02","12:12:13",123.24});
        events.add(new Object[]{"ticket3","2016-01-03","12:12:14",123.25});
        events.add(new Object[]{"ticket4","2016-01-04","12:12:15",123.26});
        events.add(new Object[]{"ticket5","2016-01-05","12:12:16",123.27});
        events.add(new Object[]{"ticket6","2016-01-06","12:12:17",123.28});
        events.add(new Object[]{"ticket7","2016-01-07","12:12:18",123.29});
        events.add(new Object[]{"ticket8","2016-01-08","12:12:19",123.30});
        events.add(new Object[]{"ticket9","2016-01-09","12:12:20",123.31});
        events.add(new Object[]{"ticket10","2016-01-10","12:12:21",123.32});
    }
}

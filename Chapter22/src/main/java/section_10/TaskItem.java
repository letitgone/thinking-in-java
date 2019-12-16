package section_10;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class TaskItem<R, C extends Callable<R>> {
    public final Future<R> future;
    public final C task;

    public TaskItem(Future<R> future, C task) {
        this.future = future;
        this.task = task;
    }
}

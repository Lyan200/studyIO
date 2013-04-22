package vector;

/**
 * Project：studyIO
 * User: Administrator
 * Date: 13-4-18
 * Time: 下午4:38
 * Usage: 比较用的接口，快速排序
 */
public interface Compare {
    boolean lessThan(Object lhs,Object rhs);
    boolean lessThanOrEqual(Object lhs,Object rhs);
}

package vector;

import java.util.Enumeration;

/**
 * Project：studyIO
 * User: Administrator
 * Date: 13-4-18
 * Time: 下午4:32
 * Usage: used to sort vector
 */
public class StrSortVector {
        static class StringComapre implements Compare{

            @Override
            public boolean lessThan(Object lhs, Object rhs) {
                return ((String)lhs).toLowerCase().compareTo(((String)rhs).toLowerCase()) < 0;
            }

            @Override
            public boolean lessThanOrEqual(Object lhs, Object rhs) {
                return ((String)lhs).toLowerCase().compareTo(((String)rhs).toLowerCase()) <= 0;
            }
        }

        private SortVector sv = new SortVector(new StringComapre());

    public boolean sorted =false;
    public void addElement(String s){
        sv.addElement(s);
        sorted = false;
    }
    public String elementAt(int index){
        if(!sorted){
           sv.sort();
            sorted = true;
        }
        return (String)sv.elementAt(index);
    }
    public Enumeration elements(){
        if(!sorted){
            sv.sort();
            sorted = true;
        }
        return sv.elements();
    }

}

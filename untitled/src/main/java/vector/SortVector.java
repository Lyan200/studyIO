package vector;

import java.util.Vector;

/**
 * Project：studyIO
 * User: Administrator
 * Date: 13-4-18
 * Time: 下午4:33
 * Usage: sort...............
 */
public class SortVector extends Vector {
    private Compare compare;
    public SortVector(Compare comp){
        compare = comp;
    }
    public void sort(){
        quickSort(0,size()-1);
    }

    private void quickSort(int left, int right) {
        if(right>left){
            Object o1 = elementAt(right);
            int i = left -1;
            int j = right;
            while(true){
                while(compare.lessThan(elementAt(++i),o1));
                while(j>0){
                    if(compare.lessThanOrEqual(elementAt(--j),o1))
                        break;
                }
                    if(i>=j) break;
                    swap(i,j);
                }
                swap(i,right);
                quickSort(left,i-1);
                quickSort(i+1,right);
                }
            }

        private void swap(int loc1,int loc2){
            Object tmp = elementAt(loc1);
            setElementAt(elementAt(loc2),loc1);
            setElementAt(tmp,loc2);
        }

}

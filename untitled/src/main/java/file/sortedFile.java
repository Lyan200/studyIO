package file;

import vector.StrSortVector;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Project：studyIO
 * User: Administrator
 * Date: 13-4-18
 * Time: 下午4:25
 * Usage:
 */
public class sortedFile {
    private File path;
    private String[] list;
    public sortedFile(final String afn){
        path = new File("E://");
        if(afn == null){
            list = path.list();
        }else{
            list = path.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    String f = new File(name).getName();
                    return f.indexOf(afn) == -1;
                }
            });
        }
        sort();
    }
    public void print(){
        for(String s: list){
            System.out.println(s);
        }
    }
    private void sort() {
        StrSortVector sv = new StrSortVector();
        for(String s : list){
            sv.addElement(s);
        }
        for(int i =0;i<list.length;i++){
            list[i] = sv.elementAt(i);
        }

    }
    public static void main(String[] args){
        sortedFile sf;
        if(args.length == 0){
            sf = new sortedFile(null);
        }else{
            sf = new sortedFile(args[0]);
        }
        sf.print();
    }
}

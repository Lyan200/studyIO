package file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Project：studyIO
 * User: Administrator
 * Date: 13-4-18
 * Time: 下午3:55
 * Usage:
 */
public class dirFile2 {
    public static FilenameFilter filter(final String afn){
        return new FilenameFilter() {
            String fn = afn;
            @Override
            public boolean accept(File dir, String name) {
                String f = new File(name).getName();
                return f.indexOf(fn) == -1  ;
            }
        };
    }
    public static void main(String[] args){
        File filePath = new File(".");
        String [] list ;
        if(args.length == 0){
            list = filePath.list();
        }else{
            list = filePath.list(filter("t"));
        }
        for(String s : list){
            System.out.println(s);
        }
    }
}

package file;

import java.io.*;

/**
 * Project：studyIO
 * User: Administrator
 * Date: 13-4-18
 * Time: 下午3:17
 * Usage:
 */
public class basicFile {
    public static void main(String[] args){
        File filePath = new File("E://");
        String [] list ;
        if(args.length == 0){
            list = filePath.list();

        }else{
            list = filePath.list(new DirFilter(args[0]));
        }
        for(String file : list){
            System.out.println(file);
        }
    }

    private static class DirFilter implements FilenameFilter {
        String afn;
        public DirFilter(String afn) {
            this.afn = afn;
        }

        @Override
        public boolean accept(File dir, String name) {
            String f = new File(name).getName();
            return f.indexOf(afn)!=-1;
        }
    }
}

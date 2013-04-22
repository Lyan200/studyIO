package file;

import java.io.File;

/**
 * Project：studyIO
 * User: Administrator
 * Date: 13-4-19
 * Time: 下午2:37
 * Usage:
 */
public class otherFileUsage {
    private final static String usage =
            "Usage:MakeDirectories path1..\n"
            +"Creates each path \n"
            +"Usage:MakeDirectories -d path1 ..\n"
            +"Deletes each path \n"
            +"Usage:MakeDirecories -r path1 path2 \n"
            +"Renames from path1 to path2";
    public static void usage(){
        System.err.println(usage);
        System.exit(1);
    }
    private static void fileData(File file){
        System.out.println(
                "AbsolutePath: "+file.getAbsolutePath()+
                        "\nCan read: "+file.canRead()+
                        "\nCan write: "+file.canWrite()+
                        "\nCan execute: "+file.canExecute()+
                        "\nName: "+ file.getName()+
                        "\nParent: "+file.getParent()+
                        "\nPath: "+file.getPath()+
                        "\nLength:"+file.length()+
                        "\nLastModified: "+file.lastModified()
        );
        if(file.isFile()){
            System.out.println();
        }
    }
    public static void main(String[] args){
//        otherFileUsage.usage();
        otherFileUsage.fileData(new File("E://aa"));
    }
}

package recursion;

import java.util.ArrayList;
import java.util.List;

public class MazePathWithJump {
    public static void main(String[] args) {
        ArrayList<String> paths = getPaths(1, 1, 3, 3);
        System.out.println(paths);
        printPaths(1,1,3,3,"");
    }

    // sr-source row
    //sc-source column
    //dc- destination column
    ///dr-destination row
    //ms move size
    private static ArrayList<String> getPaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&& sc==dc){
            ArrayList<String>baseCase=new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }
        ArrayList<String> myPath = new ArrayList<>();
        //horizontal move
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hPaths = getPaths(sr, sc + ms, dr, dc);
            for (String hpath : hPaths) {
                myPath.add("h" + ms + hpath);
            }

        }
//vertical move
        for (int ms =1; ms <= dr - sr; ms++) {
            ArrayList<String> hPaths = getPaths(sr + ms, sc, dr, dc);
            for (String hpath : hPaths) {
                myPath.add("v" + ms + hpath);
            }

        }

        //diagonal move
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            ArrayList<String> hPaths = getPaths(sr + ms, sc + ms, dr, dc);
            for (String hpath : hPaths) {
                myPath.add("d" + ms + hpath);
            }

        }
        return myPath;
    }
    private static void printPaths(int sr, int sc, int dr, int dc,String path) {
        if(sr==dr && sc==dc){
            System.out.print(path+" ");
            return;
        }
        for (int ms = 1; ms <= dc - sc; ms++) {
            printPaths(sr,sc+ms,dr,dc,path+"h"+ms);

        }
//vertical move
        for (int ms =1; ms <= dr - sr; ms++) {
            printPaths(sr+ms,sc,dr,dc,path+"v"+ms);

        }
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            printPaths(sr+ms,sc+ms,dr,dc,path+"d"+ms);

        }
    }
}

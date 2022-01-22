package recursion;

import java.util.ArrayList;

public class MazeNoOfPaths {
    public static void main(String[] args) {
        ArrayList<String>paths=getPaths(1,1,3,3);
        System.out.println(paths);
        printPaths(1,1,3,3,"");
    }

    private static ArrayList<String> getPaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&& sc==dc){
            ArrayList<String>baseCase=new ArrayList<>();
            baseCase.add("");
            return  baseCase;
        }
        ArrayList<String>hPath=new ArrayList<>();
        ArrayList<String>vPath=new ArrayList<>();
        if(sc<dc){
            vPath=getPaths(sr,sc+1,dr,dc);
        }

        if(sr<dr){
            hPath=getPaths(sr+1,sc,dr,dc);
        }

        ArrayList<String>paths=new ArrayList<>();
        for (String hp:hPath){
            paths.add("h"+hp);
        }


        for (String vp:vPath) {
            paths.add("v" + vp);
        }
        return  paths;
    }
    private static void printPaths(int sr, int sc, int dr, int dc,String path) {
        if(sr>dr || sc>dc){
            return;
        }
        if (sr == dr && sc == dc) {
            System.out.print(path+" ");
            return;
        }
        printPaths(sr , sc+1, dr, dc, path + "h");
        printPaths(sr+1,sc,dr,dc,path+"v");
    }

}

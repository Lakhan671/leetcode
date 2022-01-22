package recursion;

import java.util.ArrayList;

public class StairsPath {
    public static void main(String[] args) {
        ArrayList<String>paths=getPaths(4);
        System.out.println(paths);
       printPaths(4,"");
    }

    private static ArrayList<String> getPaths(int n) {
        if(n==0){
            ArrayList<String>baseCase=new ArrayList<>();
            baseCase.add("");
            return  baseCase;
        }else if(n<0){
            ArrayList<String>baseCase=new ArrayList<>();
            return  baseCase;
        }
        ArrayList<String>path1=getPaths(n-1);
        ArrayList<String>path2=getPaths(n-2);
        ArrayList<String>path3=getPaths(n-3);
        ArrayList<String>myPath=new ArrayList<>();
        for(String path:path1){
            myPath.add(1+path);
        }
        for(String path:path2){
            myPath.add(2+path);
        }
        for(String path:path3){
            myPath.add(3+path);
        }
        return myPath;

    }

    private static void printPaths(int n,String path) {
        if(n==0){
            System.out.print(path+" ");

            return ;
        }else if(n<0){

            return ;
        }
        printPaths(n-1,path+"1");
        printPaths(n-2,path+"2");
        printPaths(n-3,path+"3");


    }
}

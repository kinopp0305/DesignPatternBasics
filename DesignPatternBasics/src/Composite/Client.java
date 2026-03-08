package Composite;

public class Client {
    public static void main(String... args){
        //rootディレクトリ作成
        Composite rootdir = new Composite("rootdir");
        //tmpディレクトリ作成し、file1,file2を作成
        Composite tmpdir = new Composite("tmpdir");
        Leaf file1 = new Leaf("file1");
        Leaf file2 = new Leaf("file2");
        tmpdir.add(file1);
        tmpdir.add(file2);
        //rootディレクトリの直下にtmpディレクトリを置く
        rootdir.add(tmpdir);
        
        //usrディレクトリ作成し、file3,file4を作成
        Composite usrdir = new Composite("usrdir");
        Leaf file3 = new Leaf("file3");
        Leaf file4 = new Leaf("file4");
        usrdir.add(file3);
        usrdir.add(file4);
        //rootディレクトリの直下にusrディレクトリを置く
        rootdir.add(usrdir);
        
        //rootディレクトリの配下のNode,Leafを全て表示
        rootdir.printList();
    }
}

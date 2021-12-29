import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;


class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<Integer>();

        Main main = new Main();

        int num = Integer.parseInt(bf.readLine());

        for (int i=0; i<num; i++){
            String exec = bf.readLine();
            String[] array = exec.split(" ");

            if (array[0].equals("add")){
                int a = Integer.parseInt(array[1]);
                list = main.add(a, list);
            }else if (array[0].equals("remove")){
                int a = Integer.parseInt(array[1]);
                list = main.remove(a, list);
            }else if (array[0].equals("check")){
                int a = Integer.parseInt(array[1]);
                bw.write(main.check(a, list)+"\n");
            }else if (array[0].equals("toggle")){
                int a = Integer.parseInt(array[1]);
                list = main.toggle(a, list);
            }else if (array[0].equals("all")){
                ArrayList<Integer> list2 = new ArrayList<Integer>();
                for(int j=1; j<21; j++){
                    list2.add(j);
                }
                list = list2;
            }else if (array[0].equals("empty")){
                ArrayList<Integer> list2 = new ArrayList<Integer>();
                list = list2;
            }
        }
        bw.flush();
        bw.close();
    }

    public ArrayList<Integer> add(int a, ArrayList<Integer> list){

        if (list.contains(a)){
            return list;
        }else {
            list.add(a);
            return list;
        }
    }

    public ArrayList<Integer> remove(int a, ArrayList<Integer> list){

        if (list.contains(a)){
            list.remove(Integer.valueOf(a));
            return list;
        }else {
            return list;
        }
    }

    public int check(int a, ArrayList<Integer> list){
        if (list.contains(a)){
            return 1;
        }else{
            return 0;
        }
    }

    public ArrayList<Integer> toggle(int a, ArrayList<Integer> list){
        if (list.contains(a)){
            list.remove(Integer.valueOf(a));
            return list;
        }else{
            list.add(a);
            return list;
        }
    }
}
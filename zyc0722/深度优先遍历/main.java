import java.util.ArrayList;

public class main {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public void dfs(int []num,boolean isVisited[],ArrayList<Integer> list) {
        if(list.size()==num.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i<num.length;i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                list.add(num[i]);
                dfs(num, isVisited, list);
                isVisited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}

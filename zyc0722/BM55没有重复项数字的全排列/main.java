ArrayList<ArrayList<Integer>> ans;
    public void dfs(int count,int[] nums,boolean[] isVisited,ArrayList<Integer> list){//搜素的次数与nums相等时，就把数列放入ans中
        if(count==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!isVisited[i]){//判断该位置是否重复数字
                isVisited[i] = true;
                list.add(nums[i]);
                dfs(count+1,nums,isVisited,list);
                isVisited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> permute (int[] num) {
        // write code here
        ans = new ArrayList<>();
        int n = num.length;
        boolean[] isVisited = new boolean[n];
        dfs(0,num,isVisited,new ArrayList<>());
        return ans;
    }


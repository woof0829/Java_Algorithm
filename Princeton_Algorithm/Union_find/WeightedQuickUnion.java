public class WeightedQuickUnionUF{
    private int [] id;
    private int [] size;
    private int count;
    public WeightedQuickUnionUF(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N ; i++ ) id[i] = i;
        size = new int[N];
        for (int i = 0; i < N ; i++ ) size[i] = 1;
    }

    public int count(){return count;}
    public boolean connected(int p, int q){return find(p) == find(q);}
    public int find(int p){
        //跟随链接找到根节点
        while(p != id[p]) p = id[p];
        return p;
    }
    public void union(int p, int q){
        int i = find(p);
        int j = find(q);
        if (i == j) return;
        //将较小的树的根节点链接到大树的根节点
        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        }else{
            id[j] = i;
            size[i] += size[j];
        }
        count--;
    }
}

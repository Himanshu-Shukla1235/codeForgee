private:
bool detect(vector<vector<int>>&adj , vector<int>&vis , int src ){
    vis[src]=1;
    queue<pair<int,int>>q;
    q.emplace(-1,src);
    while(q.size()!=0){
        int node = q.front().second;
        int parent=q.front().first;
        q.pop();
        
        for(auto &val : adj[node]){
            if(!vis[val]){
                vis[val]=1;
                q.emplace(node,val);
                
            }else if (parent!=val){
                return true;
            }
        }
    }
    
    return false;
    
}
public:
// Function to detect cycle in an undirected graph.
bool isCycle(vector<vector<int>>& adj) {
    int n=adj.size();
    vector<int>vis(n);
   bool ch;
    for(int i=0 ; i<n ; i++){
        if(!vis[i]){
            ch= detect(adj,vis,i) ;
            if(ch){
                return true;
            }
        }
    }
    return ch;
}
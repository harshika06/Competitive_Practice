//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution
{
    public:
        
 

  int largestArea(int n,int m,int k,vector<vector<int>> &enemy)
        {
            //  code here
            //if there is no enemy
            if(k==0){
                return n*m;
            }
            vector<int>row,col;
            //push the starting point
            row.push_back(0);
            col.push_back(0);
            //push the enemy point
            for(int i=0;i<k;i++){
                row.push_back(enemy[i][0]);
                col.push_back(enemy[i][1]);
            }
            //push the ending pont
            row.push_back(n+1);
            col.push_back(m+1);
            //sort the row vector and col vector
            sort(row.begin(),row.end());
            sort(col.begin(),col.end());
            
            //now find max row value and max col value
            int max_row=0;
            int max_col=0;
            for(int i=1;i<row.size();i++){
                max_row=max(max_row,row[i]-row[i-1]-1);
            }
            
            for(int i=1;i<col.size();i++){
                max_col=max(max_col,col[i]-col[i-1]-1);
            }
            
           return max_row*max_col;
        }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,m;
        cin>>n>>m;
        int k;
        cin>>k;
        vector<vector<int>> e(k,vector<int>(2));
        for(int i=0;i<k;i++)
            cin>>e[i][0]>>e[i][1];
        Solution a;
        cout<<a.largestArea(n,m,k,e)<<endl;
    }
    return 0;
}
// } Driver Code Ends
//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    pair<int,int> endPoints(vector<vector<int>> matrix, int R, int C){
        //code here
        int i=0;

       int j=0;

       int dir=0;

       

       int n=matrix.size();

       int m=matrix[0].size();

       

       while((i<n&&j<m)&&(i>=0&&j>=0))

       {

           if(matrix[i][j]==0)

           {

               if(dir==0)

               {

                   j++;

               }

               else if(dir==1)

               {

                   i++;

               }

               else if(dir==2)

               {

                   j--;

               }

               else if(dir==3)

               {

                   i--;

               }

           }

           else{

               matrix[i][j]=0;

               

               if(dir==0)

               {

                   i++;

                   dir=1;

               }

               else if(dir==1)

               {

                   j--;

                   dir=2;

               }

               else if(dir==2)

               {

                   i--;

                   dir=3;

               }

               else if(dir==3)

               {

                   j++;

                   dir=0;

               }

           }

       }

       

       if(i<0)

       {

           i++;

       }

       

       if(j<0)

       {

           j++;

       }

       

       if(i==n)

       {

           i--;

       }

       

       if(j==m)

       {

           j--;

       }

       

       

       

       pair<int,int> ans={i,j};

       

       return ans;
        
    }
};

//{ Driver Code Starts.


int main()
{
    int tc;
	scanf("%d", &tc);
	while(tc--){
		int row, col;
		scanf("%d", &row);
		scanf("%d", &col);
		vector<vector<int>> matrix(row , vector<int> (col));
	 
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
			    cin>>matrix[i][j];
			}
		}
		Solution obj;
		pair<int,int> p = obj.endPoints(matrix, row, col);
		
		cout << "(" << p.first << ", " << p.second << ")" << endl;
	}
	return 0;
}
// } Driver Code Ends
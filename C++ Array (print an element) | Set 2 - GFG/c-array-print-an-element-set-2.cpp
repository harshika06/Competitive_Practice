//{ Driver Code Starts
#include <iostream>
using namespace std;

// } Driver Code Ends
class Solution{
    public:
    int findElementAtIndex(int a[], int n, int key) 
    {
        
    int ind = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==a[key])
            {
                 ind = i;
                
            }
        }
        return a[ind];
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, key;
        cin >> n >> key;
        int a[n];
        for (int i = 0; i < n; i++) cin >> a[i];
        Solution ob;
        cout << ob.findElementAtIndex(a, n, key) << endl;
    }

    return 0;
}
// } Driver Code Ends
/*Given a time in -hour AM/PM format, convert it to military (24-hour) time. */


#include <bits/stdc++.h>
#include <algorithm>
using namespace std;



string timeConversion(string s) 
{
    int temp=0;
    string s2;
    
    if((s[8]=='A')&&(s[9]=='M'))
    {
        if(s[0]=='1' && s[1]=='2')
        {
            s[0] ='0';
            s[1] ='0';
            
            s.erase(8,9);
            
            return s;
        }
        else
        {
            s.erase(8,9);
            
            return s;
        }
        
    }
    else
    {
        if(s[0] == '1' && s[1] == '2')
        {
            s.erase(8,9);
            
            return s;
        }
        else
        {
            s2 = s.substr(0,2);
            temp = 12 + stoi(s2);
            s2 = to_string(temp);
            s[0] = s2[0];
            s[1] = s2[1];
            
            s.erase(8,9);
            
            return s;
        }
    }



}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = timeConversion(s);

    fout << result << "\n";

    fout.close();

    return 0;
}

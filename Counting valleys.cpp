/* An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, 
for every step it was noted if it was an uphill U, or a downhill D,  step. Hikes always start and end at sea level, 
and each step up or down represents a  unit change in altitude. Given the sequence of up and down steps during a hike, find and print the number of valleys walked through. */






#include <bits/stdc++.h>
using namespace std;



string ltrim(const string &);
string rtrim(const string &);



int countingValleys(int steps, string path) 
{
    int i,level = 0,c = 0,ev = false;
    
    
    for(i=0; i<steps; i++)
    {
        if(path.at(i) == 'U')
        {
            level++;
        }
        else
        {
            level--;
        }
        
        if(level < 0)
        {
            ev = true;
        }
        
        if(level == 0 && ev == true)
        {
            c++;
            ev = false;
        }
    }
    
    
    
    
    return c;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string steps_temp;
    getline(cin, steps_temp);

    int steps = stoi(ltrim(rtrim(steps_temp)));

    string path;
    getline(cin, path);

    int result = countingValleys(steps, path);

    fout << result << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}

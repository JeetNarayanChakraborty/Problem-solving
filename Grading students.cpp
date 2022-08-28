/* HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade. */





#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);



vector<int> gradingStudents(vector<int> grades) 
{
    int i,m=0;
    
    for(i=0;i<grades.size();i++)
    {
        if(grades[i] < 38)
        {
            grades[i] = grades[i];
        }
        else
        {
            while(m <= grades[i])
            {
                m += 5;
            }
        
        
            if(m - grades[i] < 3)
            {
                grades[i] = m;
            }
            else 
            {
                grades[i] = grades[i];
            }
        }
        
        m = 0;
    }
    
    
    
    return grades;
}

class Solution{
public:	
		
	int isRepeat(string s)
	{
	    // Your code goes here
	    for(int i=1; i<=s.size()/2; i++)
    {
       if(s.size()%i==0)
       {
           string str = s.substr(0,i);
           int repeat = s.size()/i;
           string str1 = str;
           for(int i =1; i<repeat; i++)
           {
               str+=str1;
           }
           if(str==s)
           return 1;
       }
    }
    return 0;

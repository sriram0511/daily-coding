"""Time complexity O(nlogn)"""
"""Given a list of numbers and a number k, return whether any two numbers from the list add up to k."""
public boolean find(arr,k)
{
  Arrays.sort(arr);
  #this method sorts the array with O(nlogn) and effects the orginal array
  int i=0,j=arr.length-1;
  while(i<j)
  {
   if(arr[i]+arr[j]==k)
    return True;
   else if(arr[i]+arr[j]>k)
    j=j-1;
   else 
    i=i+1
  }
  return False;
 }
  

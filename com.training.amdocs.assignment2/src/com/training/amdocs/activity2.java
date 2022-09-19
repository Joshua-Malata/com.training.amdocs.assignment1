package com.training.amdocs;
import java.util.*;
public class activity2 {
    public static List<Integer> solve(int [][]matrix,int row,int col)
    {
        List<Integer> res=new ArrayList<Integer>();
        boolean[][] temp=new boolean[row][col];
        int []arr1={0,1,0,-1};
        int []arr2={1,0,-1,0};
        int di=0,r=0,c=0;
        for(int i=0;i<row*col;i++)
        {
            res.add(matrix[r][c]);
            temp[r][c]=true;
            int count1=r+arr1[di];
            int count2=c+arr2[di];
            if(count1>=0 && row>count1 && count2>=0 && col>count2 && !temp[count1][count2]){
                r=count1;
                c=count2;
            }
            else
            {
                di=(di+1)%4;
                r+=arr1[di];
                c+=arr2[di];
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                matrix[i][j]=sc.nextInt();
        }
        System.out.println(solve(matrix,m,n));
    }
}

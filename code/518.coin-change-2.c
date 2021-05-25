int change(int amount, int* coins, int coinsSize){
int brr[coinsSize+1][amount+1];
    for(int i=0;i<coinsSize+1;i++){
        brr[i][0]=1;
    }
    for(int i=1;i<amount+1;i++)
    {
        brr[0][i]=0;
    }
    for(int i=1;i<=coinsSize;i++)
    {
        for(int j=1;j<=amount;j++)
        {if(coins[i-1]<=j)
            {int l=j-coins[i-1];
                brr[i][j]=brr[i][l]+brr[i-1][j];
            }
            else
                brr[i][j]=brr[i-1][j];
                
        }
       

    }
    return brr[coinsSize][amount];
}


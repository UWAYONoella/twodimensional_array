public class arra{
    public static void main(String[] args){
        int[] arra = {0,9,8,2,5,1};
      for(int i=0;i<arra.length;i++){
                for(int j=i;j<=arra.length-1;j++){
                    int temp=0;
                    if(arra[i]<arra[j]){
                        temp=arra[i];
                        arra[i]=arra[j];
                        arra[j]=temp;
                    }System.out.println("j:"+j);
                }System.out.println("i:"+i);
                    
               }

            for(int k=0;k<arra.length;k++){
                System.out.print(arra[k]);
            }

    }
}
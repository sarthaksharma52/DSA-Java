import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    
    int[] res = new int[n];
    for(int i=0;i<n;i++){
      res[i] = count(i,0,arr);
    }
    
    Arrays.sort(res);
    
    System.out.println(res[n-1]);
    
    
  }
  private static int count(int i,int flag,int[] arr){
    int count = 0;
      for(int j=i;j<arr.length;j++){
        if(arr[j]==1){
          count++;
        }else{
          flag++;
          if(flag>=2){
            break;
          }
        }
      }
      return count;
    }
}






package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        String arquivo = args[0];
        File file = new File(arquivo);

        Scanner scanner = new Scanner(file);
            
        while(scanner.hasNext()){

            int A = scanner.nextInt();
            int D = scanner.nextInt();

            if(A == 0 && D == 0){
                break;
            }

            ArrayList<Integer> at = new ArrayList<Integer>();
            ArrayList<Integer> df = new ArrayList<Integer>();

            int min = 10001;
            boolean impedido = true;
            int cont = 0;

            for(int i=0; i<A; i++){
                at.add(scanner.nextInt());
                if(at.get(i) < min){
                    min = at.get(i);
                }
            }

            for(int i=0; i<D; i++){
                df.add(scanner.nextInt());
                if(df.get(i) <= min){
                    ++cont;
                    if(cont == 2){
                        impedido = false;
                        break;
                    }
                }
            }


            if(impedido){
                System.out.println("Y");    
            }
            else{
                System.out.println("N");
            }
        }
        
        scanner.close();
    }
}
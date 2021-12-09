package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*// dataType[] nameOfArr = new dataType[size of array];
        double[] myList=new double[10];
        myList[0]=1.0;
        myList[1]=1.5;
        myList[2] = myList[0]+myList[1];
        myList[3]=3.5;
        myList[4]=5.0;
        System.out.println(myList[2]);
        System.out.println((myList.length));
        //printing the array
        for(int i=0;i<myList.length;i++){
           //double printArr = myList[i];
           // System.out.println(printArr); or we can just replace with
            System.out.println(myList[i]);
        }*/

       // double lastItem= myList[myList.length-1];
       // double storeNum = myList[2] = myList[0]+myList[1];

       /* double[] myList ={1,3.4,5.6,4.5}; //initializing an array
        double arrLen = myList.length;
        double lastItem= myList[myList.length-1];
        System.out.println(arrLen);
        System.out.println(lastItem);*/

/*        //dynamic array
        int[] deckCards = new int[52];
        //System.out.println((deckCards[2]));
        for(int i=0; i< deckCards.length;i++)
        {
            deckCards[i] = i;
            System.out.println(i);
        }*/
      //2D arrays

        //int[][] values= new int[6][5];
       /* int[][] values= new int[][] {{10,12,43,11,22},
                {20,45,56,1,33},
                {30,67,32,14,44},
                {40,12,87,14,55},
                {50,86,66,13,66},
                {60,53,44,12,11}};


        int nRows=values.length;
        int nColumns=values.length;
        for(int row=0; row<nRows;row++){
            for (int col=0;col<nColumns-1;col++){
                int v= values[row][col];
                System.out.println(v);
            }
        }
*/
        //cloning: creates brand-new instance of the array.
     /*    int[] vals={1,2,3,4,5};
        // int[] copy= vals.clone();
       // System.out.println(Arrays.toString(copy));
        int[] copy= new int[vals.length];
        System.arraycopy(vals,0, copy, 0, copy.length);
        int[] expandVal=Arrays.copyOf(vals, 9);
        System.out.println(Arrays.toString(expandVal));
      */
        Scanner input=new Scanner(System.in);
        /*int[] values=new int[5];
        for (int i=0;i<=values.length;i++)
        {
            System.out.println("Please enter a  number at index" +i);
            values[i-1]=input.nextInt();
        }*/
        /*double[] values= new double[20];
        int maxValue=100;
        for (int i=0; i<values.length;i++){
            values[i]= Math.random() * maxValue;

        }
        System.out.println((Arrays.toString(values)));
        */

        //adding all elements in array
      /* int[] values={12,23,34,45,66};
       int sum=0;
        for (int i=0;i<values.length;i++)
        {
           sum+= values[i];
        }
        System.out.println(sum);*/

        // finding largest number of array
        //int(datatype)//Integer(wrapper class)
       /* double[] values={12,23,34,8,45,66,899};
        double maxVal=values[0];

        for(int i=0; i<values.length;i++){
            if(values[i]>maxVal){   //for min value just change cond to values[i]<maxVal
                maxVal=values[i];

            }
        }
           System.out.println(maxVal);*/

        /*double maxVal= Double.MIN_VALUE;
        for(int i=0; i< values.length;i++){
            if(values[i]> maxVal){
                maxVal=values[i];
                    //System.out.println(maxVal);
            }

            }
                System.out.println(maxVal);*/

        //Reversing an array.
        int[] values={12,23,34,8,45,66,899};
        int[] revArr=new int[values.length];
        for(int i=0, j= revArr.length-1;i < revArr.length; i++,j--){
            revArr[i]=values[j];
        }
        System.out.println(Arrays.toString(revArr));

        }

    }


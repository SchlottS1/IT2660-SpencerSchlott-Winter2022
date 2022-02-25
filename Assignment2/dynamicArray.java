import java.util.Arrays;

public class dynamicArray {
    
    private int[] arrayList;
    private int arraySize;
    private int maxSize;

    public dynamicArray()
    {
        arrayList = new int[3];
        arraySize = 0;
        maxSize = 3;
    }
// adds a number to the index position specified
    public void addNumber(int number)
    {
        if(arraySize == maxSize)
        {
            growArray();
        }
        arrayList[arraySize] = number;
        arraySize++;
        shrinkArray();
    }
//removes the last number in the array
    public void removeNumber()
    {
        for(int i=0;i<arraySize;i++)
        {
            arrayList[arraySize-1] = 0;
        }
        arraySize--;
        shrinkArray();
    }
//removes the number in the specified index position 
    public void removeNumber(int index)
    {
        if(arraySize > 0)
        {
            for(int i=index;i<arraySize-1;i++)
            {
                arrayList[i]=arrayList[i+1];
            }
            arrayList[arraySize-1]=0;
            arraySize--;
            shrinkArray();
        }
    }

//grows the array in size as needed
    public void growArray()
    {
        int[] temp =null;
        if(arraySize==maxSize)
        {
            temp = new int[maxSize*2];
            {
                for(int i = 0; i < maxSize; i++)
                {
                    temp[i] = arrayList[i];
                }
            }
        }
        arrayList = temp;
        maxSize = maxSize * 2;
    }
//adds a number at the specified index position
    public void addNumber(int index, int number)
    {
        if(arraySize == maxSize)
        {
            growArray();
        }
        for(int i = arraySize-1; i>=index;i--)
        {
            arrayList[i+1] = arrayList[i];
        }
        arrayList[index] = number;
        arraySize++;
        shrinkArray();
    }
//shrinks the size of the array so there are no extra zeros
    public void shrinkArray()
    {
        int temp[] = null;
        if (arraySize > 0)
        {
            temp = new int[arraySize];
            for(int i=0; i<arraySize;i++)
            {
                temp[i] = arrayList[i];
            }
            maxSize = arraySize;
            arrayList = temp;
        }
    }

    public void printNumbers()
    {
        System.out.println(Arrays.toString(arrayList));
    }

}

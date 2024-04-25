public class Searching {
    public int process(int[] arr, int searchElement) throws UniqueElementExceptions, ElementNotFoundExceptions {


        for (int i = 0; i < arr.length-1; i++){
            for (int j = i + 1; j < arr.length;j++){
                if(arr[i] == arr[j]){
                    throw new UniqueElementExceptions("Element inside the array is not unique");
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == searchElement){
                return i + 1;
            }
        }
        throw new ElementNotFoundExceptions("Element not found");

    }
}
